package pl.bartekk.concurrency.doubleCheckLocking;

/**
 * we could instead start by verifying if we need to create the object in the first place
 * and only in that case we would acquire the lock.
 * <p>
 * the field needs to be volatile !!
 *
 * since it requires the volatile keyword to work properly, it’s not compatible with Java 1.4 and lower versions
 * it’s quite verbose and it makes the code difficult to read
 */
public class DclSingleton {
    private static volatile DclSingleton instance;

    public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton.class) {
                if (instance == null) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }

    // private constructor and other methods...
}