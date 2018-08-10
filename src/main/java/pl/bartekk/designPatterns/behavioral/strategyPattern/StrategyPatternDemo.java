package pl.bartekk.designPatterns.behavioral.strategyPattern;

import static org.testng.Assert.assertEquals;
import java.math.BigDecimal;
import org.testng.annotations.Test;

public class StrategyPatternDemo {

    // Essentially, the strategy pattern allows us to change the behavior of an algorithm at runtime.

    @Test
    public void testEasterDiscounter() {
        Discounter easterDiscounter = new Discounter.EasterDiscounter();

        BigDecimal discountedValue = easterDiscounter
            .applyDiscount(BigDecimal.valueOf(100));

        assertEquals(discountedValue.intValue(), 50);
    }

    @Test
    public void testChristmasDiscounter() {
        Discounter christmasDiscounter = new Discounter.ChristmasDiscounter();

        BigDecimal discountedValue = christmasDiscounter
            .applyDiscount(BigDecimal.valueOf(100));

        assertEquals(discountedValue.intValue(), 90);
    }
}
