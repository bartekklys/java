package pl.bartekk.concurrency.doubleCheckLocking;

/**
 * The last solution comes from the Effective Java book (Item 3) by Joshua Block and uses an
 * enum instead of a class. At the time of writing, this is considered to be the most concise
 * and safe way to write a singleton
 */
public enum EnumSingleton {
    INSTANCE;

    // other methods...
}