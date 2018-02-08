package pl.bartekk.timeAndDateAPI;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class TimeAndDateAPIMain {

    public static void main(String[] args) {
        Instant instNow = Instant.now();
        LocalDateTime ldtNow = LocalDateTime.now();
        ZonedDateTime zdtNow = ZonedDateTime.now();
        System.out.println(instNow);
        System.out.println(ldtNow);
        System.out.println(zdtNow);
    }
}
