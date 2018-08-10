package pl.bartekk.java8.optional;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.testng.annotations.Test;

public class OptionalTest {

    // use Optional instead of explicit null checking and input validation !!!

    // Creating Optional Objects

    @Test
    public void whenCreatesEmptyOptional_thenCorrect() {
        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }

    @Test
    public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
        String name = "Bartek";
        Optional<String> opt = Optional.of(name);
        assertTrue(opt.isPresent());
        assertEquals("Optional[Bartek]", opt.toString());
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
        // the argument passed to the of method cannot be null, otherwise, we will get a NullPointerException
        String name = null;
        Optional<String> opt = Optional.of(name);
    }

    @Test
    public void givenNonNull_whenCreatesNullable_thenCorrect() {
        String name = "Bartek";
        Optional<String> opt = Optional.ofNullable(name);
        assertEquals("Optional[Bartek]", opt.toString());
    }

    @Test
    public void givenNull_whenCreatesNullable_thenCorrect() {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        assertEquals("Optional.empty", opt.toString());
    }

    // Checking Value With isPresent()

    @Test
    public void givenOptional_whenIsPresentWorks_thenCorrect() {
        Optional<String> opt = Optional.of("Bartek");
        assertTrue(opt.isPresent());

        opt = Optional.ofNullable(null);
        assertFalse(opt.isPresent());
    }

    // Conditional Action With ifPresent()

    @Test
    public void givenOptional_whenIfPresentWorks_thenCorrect() {
        // before java 8
        String name = "Bartek";
        if (name != null) {
            System.out.println(name.length());
        }

        // with java 8 Optional
        Optional<String> opt = Optional.of(name);
        opt.ifPresent(p -> System.out.println(p.length()));
    }

    // Default Value With orElse

    @Test
    public void whenOrElseWorks_thenCorrect() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("john");
        assertEquals("john", name);
    }

    // Default Value With orElseGet

    @Test
    public void whenOrElseGetWorks_thenCorrect() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
        assertEquals("john", name);
    }

    // Difference Between orElse and orElseGet

    private String getMyDefault() {
        System.out.println("Getting Default Value");
        return "Default Value";
    }

    @Test
    public void whenOrElseGetAndOrElseOverlap_thenCorrect() {
        String text = null;

        System.out.println("Using orElseGet:");
        String defaultText =
            Optional.ofNullable(text).orElseGet(this::getMyDefault);
        assertEquals("Default Value", defaultText);

        System.out.println("Using orElse:");
        defaultText = Optional.ofNullable(text).orElse(getMyDefault());
        assertEquals("Default Value", defaultText);
    }

    @Test
    public void whenOrElseGetAndOrElseDiffer_thenCorrect() {
        String text = "Text present";

        System.out.println("Using orElseGet:");
        String defaultText
            = Optional.ofNullable(text).orElseGet(this::getMyDefault);
        assertEquals("Text present", defaultText);

        System.out.println("Using orElse:");
        defaultText = Optional.ofNullable(text).orElse(getMyDefault());
        assertEquals("Text present", defaultText);
    }

    // Exceptions with orElseThrow

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void whenOrElseThrowWorks_thenCorrect() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseThrow(
            IllegalArgumentException::new);
    }

    // Returning Value with get(), will probably be deprecated in a future release

    @Test
    public void givenOptional_whenGetsValue_thenCorrect() {
        Optional<String> opt = Optional.of("Bartek");
        String name = opt.get();

        assertEquals("Bartek", name);
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    public void givenOptionalWithNull_whenGetThrowsException_thenCorrect() {
        // can only return a value if the wrapped object is not null, otherwise, it throws a no such element exception
        Optional<String> opt = Optional.ofNullable(null);
        String name = opt.get();
    }

    // Conditional Return with filter()

    @Test
    public void whenOptionalFilterWorks_thenCorrect() {
        Integer year = 2016;
        Optional<Integer> yearOptional = Optional.of(year);
        boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
        assertTrue(is2016);
        boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
        assertFalse(is2017);
    }

    private class Modem {
        private Double price;

        public Modem(Double price) {
            this.price = price;
        }

        public Double getPrice() {
            return price;
        }
    }


    // without Java 8
    public boolean priceIsInRange1(Modem modem) {
        boolean isInRange = false;

        if (modem != null && modem.getPrice() != null
            && (modem.getPrice() >= 10
            && modem.getPrice() <= 15)) {

            isInRange = true;
        }
        return isInRange;
    }

    // with Jav a8 Optional
    public boolean priceIsInRange2(Modem modem2) {
        return Optional.ofNullable(modem2)
            .map(Modem::getPrice)
            .filter(p -> p >= 10)
            .filter(p -> p <= 15)
            .isPresent();
    }

    @Test
    public void whenFiltersWithOptional_thenCorrect() {
        System.out.println(priceIsInRange2(null));
        assertTrue(priceIsInRange2(new Modem(10.0)));
        assertFalse(priceIsInRange2(new Modem(9.9)));
        assertFalse(priceIsInRange2(new Modem(null)));
        assertFalse(priceIsInRange2(new Modem(15.5)));
        assertFalse(priceIsInRange2(null));
    }

    // Transforming Value with map()

    @Test
    public void givenOptional_whenMapWorks_thenCorrect() {
        List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
        Optional<List<String>> listOptional = Optional.of(companyNames);

        int size = listOptional
            .map(List::size)
            .orElse(0);
        assertEquals(6, size);
    }

    @Test
    public void givenOptional_whenMapWorks_thenCorrect2() {
        String name = "Bartek";
        Optional<String> nameOptional = Optional.of(name);

        int length = nameOptional
            .map(String::length)
            .orElse(0);
        assertEquals(6, length);
    }

    @Test
    public void givenOptional_whenMapWorksWithFilter_thenCorrect() {
        String password = " password ";
        Optional<String> passOpt = Optional.of(password);
        boolean correctPassword = passOpt.filter(
            pass -> pass.equals("password")).isPresent();
        assertFalse(correctPassword);

        correctPassword = passOpt
            .map(String::trim)
            .filter(pass -> pass.equals("password"))
            .isPresent();
        assertTrue(correctPassword);
    }

    // map() vs. flatMap()
    // The difference is that map transforms values only when they are unwrapped whereas flatMap takes a wrapped value and unwraps it before transforming it.


}