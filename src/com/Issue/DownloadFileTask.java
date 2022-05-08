package com.Issue;


public class DownloadFileTask implements Runnable {
    private DownloadStatus status;
    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file. " + Thread.currentThread().getName());
        // 每个DownloadFIleTask下载1million字节
        for (var i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted()) break;
            status.incrementTotalBytes();
        }
        // 修改Download对象的标志
        status.done();
        System.out.println("Download complete. " + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
