package pl.bartekk.concurrency;

public class ThreadExample extends Thread {

    @Override
    public void run() {
        System.out.println("Custom thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Current thread: " + Thread.currentThread().getName());

        System.out.println("Creating thread...");
        Thread thread = new ThreadExample();

        System.out.println("Starting thread...");
        thread.start();

        /**
         * Output
         *
         * Current thread: main
         * Creating thread...
         * Starting thread...
         * Custom thread: Thread-0
         */
    }
}
