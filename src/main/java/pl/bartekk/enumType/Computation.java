package pl.bartekk.enumType;

public enum Computation {

    ADD {
        public double perform(double x, double y) {
            return x + y;
        }
    },
    SUBTRACT {
        public double perform(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY {
        public double perform(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        public double perform(double x, double y) {
            if (y != 0) {
                return x / y;
            } else {
                throw new ArithmeticException("Division by 0 not allowed!");
            }
        }
    };

    public abstract double perform(double x, double y);

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Computation.ADD.perform(5, 2));
        System.out.println(Computation.SUBTRACT.perform(5, 2));
        System.out.println(Computation.MULTIPLY.perform(5, 2));
        System.out.println(Computation.DIVIDE.perform(5, 2));
        Thread.sleep(100);
        System.out.println(Computation.DIVIDE.perform(5, 0));
    }
}
