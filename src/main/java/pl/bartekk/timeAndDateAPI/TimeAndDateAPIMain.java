package pl.bartekk.timeAndDateAPI;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Java 8 Time and Date API Reference
 * http://mattgreencroft.blogspot.com/2014/12/java-8-time-choosing-right-object.html
 * https://blog.tompawlak.org/java-8-conversion-new-date-time-api
 * https://www.nagarro.com/en/perspectives/post/28/java-8-new-date-and-time-api
 */
public class TimeAndDateAPIMain {

    public static void main(String[] args) {

        /**
         * Old Time API issues:
         * java.util.Date & java.sql.Date - confusing
         * non-tread safe
         */
        /*java.util.Date utilDate = new java.util.Date();
        System.out.println(utilDate);

        java.sql.Date sqlDate = new java.sql.Date(1413125312112l);
        System.out.println(sqlDate);*/

        /**
         * New Time API:
         * 1. Immutable - cannot change existing value
         *
         */

        /*LocalDate d = LocalDate.now(); // only date, no time
        LocalDate d1 = LocalDate.of(1993, Month.AUGUST, 03);
        LocalDate d2 = LocalDate.of(1996, Month.FEBRUARY, 29); // throw exc is not a leap year
        System.out.println(d2);*/


        LocalTime t = LocalTime.now();
        LocalTime t1 = LocalTime.of(12, 35, 10, 999);
        LocalTime t2 = LocalTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(t2);

        // to print all available zones
        /*for (String s :
            ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }*/

        Instant instNow = Instant.now();
        LocalDateTime ldtNow = LocalDateTime.now();
        ZonedDateTime zdtNow = ZonedDateTime.now();
        System.out.println(instNow); // Z - Zulu time, also known as GMT (Grenwich Mean Time) or UTC (Coordinated Universal Time)
        System.out.println(ldtNow);
        System.out.println(zdtNow);

    }
}
