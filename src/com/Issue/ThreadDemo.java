package com.Issue;


import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {

        var status = new DownloadStatus();

        // 模拟下载文件
        Thread thread1 = new Thread(new DownloadFileTask(status));
        // 检查下载是否完成
        Thread thread2 = new Thread(() -> {
            while (!status.isDone()) {
                // 1. 若这里什么都不写，则运行时，thread2不会跳出while循环，需要手动结束程序。（符合预期

                // 2. 若这里写一句 ↓ 则会thread2会跳出while循环，输出下载总字节数，说明thread2读取到了最新的isDone数据（为什么和1.不一样？
//                System.out.println("Thread1 好了吗？");

                // 3. 若DownloadFileStatus里的标志位前加上volatile, 这个循环体什么都不做，则证明了volatile的可以实现免锁线程安全（符合预期

                // 4. 若这里什么都不写，但是在while循环这加上断点，debug模式运行，也会让thread2读到最新的数据，正常输出。（为什么和1.不一样？1

//                // 5. wait()
//                synchronized (status) {
//                    try {
//                        status.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }

            }
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();
    }
}
