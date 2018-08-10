package pl.bartekk.designPatterns.behavioral.strategyPattern.java8;

import static org.testng.Assert.assertEquals;
import java.math.BigDecimal;
import org.testng.annotations.Test;

public class StrategyPatternDemo {

    // Essentially, the strategy pattern allows us to change the behavior of an algorithm at runtime.

    @Test
    public void testEasterDiscounter() {
        Discounter easterDiscounter = Discounter.easterDiscounter();
        assertEquals(easterDiscounter.applyDiscount(new BigDecimal(100)).intValue(), 50);
    }

    @Test
    public void testNewYearDiscounter() {
        Discounter newYearDiscounter = Discounter.newYearDiscounter();
        assertEquals(newYearDiscounter.applyDiscount(new BigDecimal(100)).intValue(), 80);
    }

    @Test
    public void testChristmasDiscounter() {
        Discounter christmasDiscounter = Discounter.christmasDiscounter();
        assertEquals(christmasDiscounter.applyDiscount(new BigDecimal(100)).intValue(), 90);
    }
}
