package pl.bartekk.concurrency.doubleCheckLocking;

/**
 * The easiest way to achieve thread safety is to inline the object creation or to use an
 * equivalent static block. This takes advantage of the fact that static fields and blocks
 * are initialized one after another
 */
public class EarlyInitSingleton {
    private static final EarlyInitSingleton INSTANCE = new EarlyInitSingleton();

    public static EarlyInitSingleton getInstance() {
        return INSTANCE;
    }

    // private constructor and other methods...
}