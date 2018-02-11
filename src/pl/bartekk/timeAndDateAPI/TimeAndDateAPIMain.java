package pl.bartekk.timeAndDateAPI;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/**
 * Java 8 Time and Date API Reference
 * http://mattgreencroft.blogspot.com/2014/12/java-8-time-choosing-right-object.html
 * https://blog.tompawlak.org/java-8-conversion-new-date-time-api
 * https://www.nagarro.com/en/perspectives/post/28/java-8-new-date-and-time-api
 */
public class TimeAndDateAPIMain {

    public static void main(String[] args) {
        Instant instNow = Instant.now();
        LocalDateTime ldtNow = LocalDateTime.now();
        ZonedDateTime zdtNow = ZonedDateTime.now();
        System.out.println(instNow); // Z - Zulu time, also known as GMT (Grenwich Mean Time) or UTC (Coordinated Universal Time)
        System.out.println(ldtNow);
        System.out.println(zdtNow);
    }
}
