package com.Executors;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class CompletableFutureDemo {
    // 6. 使用CompletableFuture的方法，以申明的方式执行复杂的异步操作
    public static int toFahrenheit(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }

    // 7. 用函数转换结果
    public static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email");
    }

    public static CompletableFuture<String> getPlayListAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "playList");
    }

    public static void show() {

        // 10. 处理超时
        var t10 = CompletableFuture.supplyAsync(() ->{
            LongTask.simulate();
            return 10;
        });
        try {
            var res10 = t10.completeOnTimeout(1,1,TimeUnit.SECONDS)
                    .get();
            System.out.println(res10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // 9. Waiting for all task to finish
        var t1 = CompletableFuture.supplyAsync(() -> 1);
        var t2 = CompletableFuture.supplyAsync(() -> 2);
        var t3 = CompletableFuture.supplyAsync(() -> 3);
        var res9 = CompletableFuture.allOf(t1, t2, t3);
        res9.thenRun(() -> {
            System.out.println("All task finished.");
            try {
                var result = t1.get();
                System.out.println(result);
            } catch (InterruptedException |ExecutionException e) {
                e.printStackTrace();
            }
        });

        // 8. Combine CompletableFuture 让两个CompletableFuture异步并行，不阻塞main，都出结果再后下一步
        var first = CompletableFuture
                .supplyAsync(() -> "20USD")
                .thenApply(str -> {
                    var price = str.replace("USD", "");
                    return Integer.parseInt(price);
                });
        var second = CompletableFuture.supplyAsync(() -> 0.9);

        first // 不会阻塞main
              .thenCombine(second, (price, exchangeRate) -> price * exchangeRate) // 返回一个新的CompletableFuture object
              .thenAccept(res8 -> System.out.println(res8));

        // 7. Composing. 以declarative方式构建复杂的异步操作。
        getUserEmailAsync()
                .thenCompose(CompletableFutureDemo::getPlayListAsync)
                .thenAccept(playList -> System.out.println(playList));

        // 6. Transform result
        //    好处：使用CompletableFuture的方法，以申明的方式执行复杂的异步操作
        var future6 = CompletableFuture.supplyAsync(() -> 30);
        future6.thenApply(CompletableFutureDemo::toFahrenheit)
                .thenAccept(t -> System.out.println(t));

        // 5. 处理异常
        var future5 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting the current weather.");
            throw new IllegalStateException();
        });

        try {
            var res = future5.exceptionally(e -> 5).get();
            System.out.println(res);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.getCause();
        }

// 4. 在异步任务完成后执行下一步代码。
        var future4 = CompletableFuture.supplyAsync(() -> 4);

        future4.thenRunAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done");
        });

        future4.thenAcceptAsync(result4 -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result4);
        });


// 3. 实现 Asynchronous API，不阻塞当前线程，允许更好的利用并行硬件
        var service = new MailService();
//        service.send(); // 依然是blocking code。
        service.sendAsync();
        System.out.println("我喜欢你编程的样子！");
        System.out.println(Thread.currentThread().getName());

        // Command line app, 很快结束了。
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


// 2. Non-Blocking（异步）方法，直接用CompletableFuture.runAsync(),传入Runnable对象即可。
        // return a commonPool use by CompletableFuture Class.
        // 它知道available threads.
        ForkJoinPool.commonPool();
        // 不返回值，用runAsync
        Runnable task1 = () -> System.out.println("Hello! I like you!");
        CompletableFuture.runAsync(task1);

        // 返回值，用supplier
        Supplier<Integer> task2 = () -> 2;
        var future2 = CompletableFuture.supplyAsync(task2);
        try {
            var result2 = future2.get();
            System.out.println(result2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
