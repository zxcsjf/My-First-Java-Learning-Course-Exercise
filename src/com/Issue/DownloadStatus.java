package com.Issue;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    private Object totalBytesLock = new Object();
    private boolean isDone = false;

    public void incrementTotalBytes() {
        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }

    public int getTotalBytes() {
        return totalBytes;
    }
}

