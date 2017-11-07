package pl.bartekk.designPatterns.structural.flyweight;

public class FlyweightPatternDemo {

    private static final String colors[] = {"Green", "Blue", "Red", "Black", "Yellow", "Orange", "White"};

    public static void main(String[] args) {

        for(int i = 0 ; i < 20 ; i++) {
            Circle circle = ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    public static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    public static int getRandomY() {
        return (int) (Math.random() * 100);
    }

    public static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
