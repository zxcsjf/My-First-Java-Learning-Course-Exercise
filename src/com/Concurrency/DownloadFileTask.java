package com.Concurrency;

public class DownloadFileTask implements Runnable {
    private DownloadStatus status;
// // 7.
//    public DownloadFileTask() {
//        this.status = new DownloadStatus();
//    }

    // 8. use lock
    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file. " + Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName());
        for (var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) break;
            status.incrementTotalBytes();
        }
//        // 10. Volatile
//        status.done();

//        try {
//            // 2. Pausing a thread
//            //
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Download complete. " + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
