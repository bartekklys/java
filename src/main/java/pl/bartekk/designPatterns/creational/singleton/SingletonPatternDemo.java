package pl.bartekk.designPatterns.creational.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getInfo());

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setInfo("Hello world!");

        System.out.println(singleton1.getInfo());
        System.out.println(singleton2.getInfo());

        // enum
        System.out.println("ENUM");

        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
        System.out.println(enumSingleton1.getInfo());

        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton2.setInfo("Hello world!");

        System.out.println(enumSingleton1.getInfo());
        System.out.println(enumSingleton2.getInfo());
    }
}