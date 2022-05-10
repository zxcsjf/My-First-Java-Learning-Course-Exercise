package com.Executors;

import java.util.concurrent.CompletableFuture;

public class MailService {
    // 同步方法，在main thread 执行
    public void send() {
        LongTask.simulate();
        System.out.println(Thread.currentThread().getName());
        System.out.println("Mail was send.");
    }

    // 异步方法，在commonPool执行
    // wrap inside CompletableFuture
    public CompletableFuture<Void> sendAsync() {
        var res = CompletableFuture.runAsync(() -> send());
        return res;
    }
}
