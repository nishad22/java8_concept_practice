package timeapi;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant.toString());

        //epoch start from Epoch -> 86400 (a day sec)
        System.out.println("getEpochSecond(): "+instant.getEpochSecond());
        System.out.println("starting of epoch: "+Instant.ofEpochSecond(0));

        Instant instant1 = Instant.now();
        Duration duration = Duration.between(instant,instant1);
        System.out.println("Duration: "+duration.getNano());
    }
}
