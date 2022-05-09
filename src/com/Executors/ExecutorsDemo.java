package com.Executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        var executor = Executors.newFixedThreadPool(10);
        var executor1 = Executors.newSingleThreadExecutor();
        var executor2 = Executors.newScheduledThreadPool(4);

        System.out.println(executor.getClass().getName());
        try {
//            for (var i = 0; i < 20; i++)
//                executor.submit(() -> {
//                    System.out.println(Thread.currentThread().getName());
//                });

            var future = executor.submit(() -> {
                LongTask.simulate();
                return 1;
            });

            System.out.println("Do more work");
            try {
                var result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
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
