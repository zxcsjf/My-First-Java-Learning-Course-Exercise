package com.Executors;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class ExecutorsDemo {

    public static void show() {


// 1. 阻塞（同步）方法，要创executor对象，call submit方法，再显式shutdown。三步
//     会阻塞当前thread，不好。
        var executor = Executors.newFixedThreadPool(10);
        var executor1 = Executors.newSingleThreadExecutor();
        var executor2 = Executors.newScheduledThreadPool(4);
        try {
//            for (var i = 0; i < 20; i++)
//                executor.submit(() -> {
//                    System.out.println(Thread.currentThread().getName());
//                });

            var future = executor.submit(() -> {
                LongTask.simulate();
                return 1;
            });
            // immediately return a future object.

            System.out.println("Do more work");
            try {
//                future.cancel(true);
//                future.isCancelled();
                future.get(3500, TimeUnit.MILLISECONDS);
                var result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                e.printStackTrace();
            }
        } finally {
            // Wait completion of current task,
            // but not accept new task.
            executor.shutdown();

            // force the existing task to stop.
//        executor.shutdownNow();
        }


    }
}
