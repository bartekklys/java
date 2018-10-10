package pl.bartekk.concurrency.doubleCheckLocking;

/**
 * Additionally, since we know from the Java Language Specification reference in the previous
 * paragraph that a class initialization occurs the first time we use one of its methods or fields,
 * we can use a nested static class to implement lazy initialization
 */
public class InitOnDemandSingleton {
    private static class InstanceHolder {
        private static final InitOnDemandSingleton INSTANCE = new InitOnDemandSingleton();
    }

    public static InitOnDemandSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    // private constructor and other methods...
}