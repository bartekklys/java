package pl.bartekk.concurrency;

class Counter {

    private int count = 0;

    public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
