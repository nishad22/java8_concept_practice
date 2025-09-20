package timeapi;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DurationExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(7, 20);
        LocalTime localTime1 = LocalTime.of(9, 20);

        long result = localTime.until(localTime1, ChronoUnit.SECONDS);
        System.out.println(result);

        Duration duration = Duration.between(localTime, localTime1);
        System.out.println("duration: "+duration.toSeconds());

        Duration d = Duration.ofHours(3);
        System.out.println("convert hours to minute: "+d.toMinutes());

    }
}
