package com.Executors;

import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        var executor = Executors.newFixedThreadPool(10);
        for (var i = 0; i < 20; i++)
        executor.submit(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        executor.shutdown();
    }
}
