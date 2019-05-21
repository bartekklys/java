package pl.bartekk.tryWithResources;

public class AutoCloseableResourcesTest {

    public static void main(String[] args) throws Exception {

        // Resources that were defined/acquired first will be closed last

        try (AutoCloseableResourcesFirst af = new AutoCloseableResourcesFirst();
             AutoCloseableResourcesSecond as = new AutoCloseableResourcesSecond()) {

            af.doSomething();
            as.doSomething();
        }
    }
}
