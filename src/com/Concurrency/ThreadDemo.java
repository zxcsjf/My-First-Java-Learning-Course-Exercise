package com.Concurrency;

import java.util.ArrayList;
import java.util.List;

// 1. Process contains an image of applications code, it has some memory and a brunch of other resources.
public class ThreadDemo {
    public static void show() {

        // 10. Volatile "不稳定" visibility
        var status = new DownloadStatus();

        // 模拟下载文件
        Thread thread1 = new Thread(new DownloadFileTask(status));
        // 检查下载是否完成
        Thread thread2;
        thread2 = new Thread(() -> {
            while (!status.isDone()) {

            }
//            System.out.println("After " + Thread.currentThread().getName());
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();

//        // 7. 9.
//        var status = new DownloadStatus();
//
//        List<Thread> threads = new ArrayList<>();
////        // 7. 创任务list，使流处理汇总reduce，得到totalBytes
////        List<DownloadFileTask> tasks = new ArrayList<>();
//
//        // 5. start all the thread simultaneously, do not join().
//        for (var i = 0; i < 10; i++) {
////            var task = new DownloadFileTask();
////            tasks.add(task);
//
//            Thread thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//// 6. 不能在这里用 thread.join(), 会使main线程等待前一个download线程完成，才开启下一个download线程,没有实现并行
////            thread.join();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//        // 6. 为了等所有的thread结束，再打印totalBytes。
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        // 6. 失去更新
//        // 8. Lock
//        System.out.println(status.getTotalBytes());
//
//        // 7. Confinement
////        var totalBytes = tasks.stream()
////                .map(t -> t.getStatus().getTotalBytes())
////                .reduce(0, Integer::sum);
////
////        System.out.println(totalBytes);


//        System.out.println(Thread.currentThread().getId());
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.activeCount());
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
//
//        // 2. Thread scheduler
//        Thread thread = new Thread(new DownloadFileTask());
//        // 1. Start a thread.
//        thread.start();
//
//        // 4. InterruptThread
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        // 4. interrupt method 不强迫这个线程停止，他只发送停止信号。
//        //   需要在class内的run() constantly 检查中断请求，然后break或return。
//        thread.interrupt();
//            try {
//                // 3. join(): 告诉main方法，等待另一个thread的完成，此时main thread不能做别的事。
        //     blocking method
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            System.out.println("File is ready to be scanned.");


    }
}
