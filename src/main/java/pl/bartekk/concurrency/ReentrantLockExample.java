package pl.bartekk.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private static int counter = 0;

    private static ReentrantLock lock = new ReentrantLock();

    public static void increment() {
        System.out.println("isLocked: " + lock.isLocked());
        lock.lock();
        System.out.println("isLocked: " + lock.isLocked());
        System.out.println("isHeldByCurrentThread: " + lock.isHeldByCurrentThread());
        System.out.println("isAcquired: " + lock.tryLock());
        try {
            counter = counter++;

            Runnable runnable = () -> System.out.println(lock.tryLock());
            Thread t = new Thread(runnable);
            t.start();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        increment();
    }
}
