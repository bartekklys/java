package pl.bartekk.designPatterns.creational.singleton;

/**
 * This approach has serialization and thread-safety guaranteed by the enum implementation itself,
 * which ensures internally that only the single instance is available, correcting the problems
 * pointed out on the class-based implementation.
 */
public enum EnumSingleton {

    INSTANCE("Initial class info");

    private String info;

    EnumSingleton(String info) {
        this.info = info;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
