package pl.bartekk.designPatterns.behavioral.strategyPattern;

import java.math.BigDecimal;

public interface Discounter {

    BigDecimal applyDiscount(BigDecimal amount);

    class EasterDiscounter implements Discounter {

        @Override
        public BigDecimal applyDiscount(BigDecimal amount) {
            return amount.multiply(new BigDecimal(0.5));
        }
    }

    class ChristmasDiscounter implements Discounter {
        @Override
        public BigDecimal applyDiscount(final BigDecimal amount) {
            return amount.multiply(BigDecimal.valueOf(0.9));
        }
    }

}
