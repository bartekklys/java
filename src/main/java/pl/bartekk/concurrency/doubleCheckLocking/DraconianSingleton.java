package pl.bartekk.concurrency.doubleCheckLocking;

/**
 * performance drawback: each time we want to get the instance of our singleton,
 * we need to acquire a potentially unnecessary lock.
 */
public class DraconianSingleton {
    private static DraconianSingleton instance;

    public static synchronized DraconianSingleton getInstance() {
        if (instance == null) {
            instance = new DraconianSingleton();
        }
        return instance;
    }

    // private constructor and other methods ...
}
