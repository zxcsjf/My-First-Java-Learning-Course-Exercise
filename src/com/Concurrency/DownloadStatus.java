package com.Concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private LongAdder totalBytes = new LongAdder();

//    // 8. Lock
//    private Lock lock = new ReentrantLock();

    // 9.
    private Object totalBytesLock = new Object();

    // 10.
    private volatile boolean isDone = false;
//
    public int getTotalBytes() {
        return totalBytes.intValue();
    }
//
//    // 10. Volatile
//    public boolean isDone() {
//        return isDone;
//    }
//
    public void done() {
        isDone = true;
    }

    public void incrementTotalBytes() {
        totalBytes.increment();
    }


//    // 9. synchronized
//    public void incrementTotalBytes() {
//        // 9. 同步不要用this作为monitor object !!!
//        //    也不要用 public synchronized void 方法，等效于用this
//        synchronized (totalBytesLock) {
//            totalBytes++;
//        }
//    }

//    // 8. lock
//    public void incrementTotalBytes() {
//        lock.lock();
//        try {
//            totalBytes++;
//        } finally {
//            lock.unlock();
//        }
//    }

}

