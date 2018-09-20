package pl.bartekk.concurrency.livelock;

public class Livelock {

    public static void main (String[] args) {

        final Worker worker1 = new Worker("Worker 1 ", true);
        final Worker worker2 = new Worker("Worker 2", true);

        final CommonResource s = new CommonResource(worker1);

        new Thread(() -> worker1.work(s, worker2)).start();
        new Thread(() -> worker2.work(s, worker1)).start();
    }

    /**
     * Output
     *
     * Worker 1  : handover the resource to the worker Worker 2
     * Worker 2 : handover the resource to the worker Worker 1
     * Worker 1  : handover the resource to the worker Worker 2
     * Worker 2 : handover the resource to the worker Worker 1
     * ...
     */
}