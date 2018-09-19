package pl.bartekk.solidPrinciples;

/**
 * O - Open/Closed Principle
 */
public class OCP {

    /**
     * There is a base interface Shape. All shapes now implement the base interface Shape
     * Shape interface has an abstract method calculateArea(). Both circle & rectangle provide
     * their own overridden implementation of calculateArea() method using their own attributes.
     * We have brought-in a degree of extensibility as shapes are now an instance of Shape
     * interfaces. This allows us to use Shape instead of individual classes wherever these
     * classes are used by any consumer.
     */
    public interface Shape {
        public double calculateArea();
    }

    public class Rectangle implements Shape {
        double length;
        double width;

        public double calculateArea() {
            return length * width;
        }
    }

    public class Circle implements Shape {
        public double radius;

        public double calculateArea() {
            return (22 / 7) * radius * radius;
        }
    }
}
