package pl.bartekk.innerClasses;

public class OuterClass {

    public class InnerClass{}

    public InnerClass instantiate() {
        return new InnerClass();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
    }
}
