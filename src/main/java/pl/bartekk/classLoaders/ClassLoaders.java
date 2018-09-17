package pl.bartekk.classLoaders;

import java.util.ArrayList;
import org.slf4j.LoggerFactory;

public class ClassLoaders {

    public static void main(String[] args) throws ClassNotFoundException {
        printClassLoaders();
    }

    public static void printClassLoaders() throws ClassNotFoundException {

        System.out.println("Classloader of this class: ----- "
            + ClassLoaders.class.getClassLoader());

        System.out.println("Classloader of Logging: ----- "
            + LoggerFactory.class.getClassLoader());

        System.out.println("Classloader of ArrayList: ----- "
            + ArrayList.class.getClassLoader());
    }
}
