package pl.bartekk.designPatterns.creational.singleton;

public class Singleton {

    //create an object of Singleton
    private static Singleton instance;
    private String info = "Initial info class";

    //make the constructor private so that this class cannot be
    //instantiated
    private Singleton() {
    }

    //Get the only object available
    public static Singleton getInstance() {
        return instance == null ? instance = new Singleton() : instance;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}