package pl.bartekk.designPatterns.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount.BankAccountBuilder("Bartek", "12345")
            .withEmail("bartek@pl").wantNewsletter(true).build();

        System.out.println(account.getEmail());
    }
}
