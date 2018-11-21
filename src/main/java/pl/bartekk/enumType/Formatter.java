package pl.bartekk.enumType;

public enum Formatter {

    CALM {
        public String format(String message) {
            return "Calm message: " + message;
        }
    },
    NERVOUS {
        public String format(String message) {
            return "Nervous message: " + message + "!!!";
        }
    };

    public abstract String format(String message);

    public static void main(String[] args) {
        System.out.println(Formatter.CALM.format("Hello world"));
        System.out.println(Formatter.NERVOUS.format("Hello world"));
    }
}
