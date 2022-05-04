package com.Concurrency;

public class ThreadDemo {
    public static void show()  {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());

        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
            try {
                // 告诉main方法，等待另一个thread的完成，此时main thread不能做别的事。
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("File is ready to be scanned.");
        }


    }
}
