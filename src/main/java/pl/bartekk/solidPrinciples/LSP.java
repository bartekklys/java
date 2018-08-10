package pl.bartekk.solidPrinciples;

/**
 * L - Liskov’s Substitution Principle
 * parent classes should be easily substituted with their child classes without blowing up the application
 */
public class LSP {

    static class Animal {
        static void makeNoise() {
            System.out.println("I am making noise");
        }
    }

    public static class Dog extends Animal {
        static void makeNoise() {
            System.out.println("bow wow");
        }
    }

    public static class Cat extends Animal {
        static void makeNoise() {
            System.out.println("meow meow");
        }
    }

    // child class should not implement code such that if it is replaced by the parent class then
    // the application will stop running. For ex.:

    static class DeafDog extends Animal {
        static void makeNoise() {
            throw new RuntimeException("I can't make noise");
        }
    }

    public static void main(String[] args) {
        Animal.makeNoise();
        Dog.makeNoise();
        Cat.makeNoise();
        DeafDog.makeNoise();
    }
}