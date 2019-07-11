package pl.bartekk.java8;

public class EffectivelyFinal {

    public void someMethod() {
        final String finalVariable = "final variable";
        String effectivelyFinalVariable = "effectively final variable";
        String nonFinalVariable = "non final variable";

        class InnerClass {
            public void saySomething() {
                System.out.println(finalVariable);
                System.out.println(effectivelyFinalVariable);
//                System.out.println(nonFinalVariable); <- needs to be final or effectively final
            }
        }

        InnerClass instance = new InnerClass();
        instance.saySomething();

        nonFinalVariable = "new value";
    }

    public static void main(String[] args) {
        EffectivelyFinal effectivelyFinal = new EffectivelyFinal();
        effectivelyFinal.someMethod();
    }
}
