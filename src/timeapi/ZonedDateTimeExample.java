package timeapi;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime(): "+zonedDateTime);
        System.out.println("getOffset(): "+zonedDateTime.getOffset());
        System.out.println("getZone() -> ZoneID: "+zonedDateTime.getZone());
//        System.out.println("Available zone: "+ ZoneId.getAvailableZoneIds());
//        ZoneId.getAvailableZoneIds()
//                .stream()
//                .forEach(System.out::println);
        System.out.println("Available zone size: "+ZoneId.getAvailableZoneIds().size());
        System.out.println("IST Dubai   : "+ZoneId.of("Asia/Dubai"));
        System.out.println("IST calcutta: "+ZoneId.of("Asia/Calcutta"));
        System.out.println(ZonedDateTime.now(Clock.system(ZoneId.of("Asia/Calcutta"))));

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Dubai"));
        System.out.println("Dubai time: "+localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("Asia/Dubai")));
        System.out.println("Dubai time with Clock.System "+localDateTime1);

        //convert from LocalDateTime, instant to ZonedLocalDate and time

        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println("localDateTime2: "+localDateTime2);

        ZonedDateTime zonedDateTime1 = localDateTime2.atZone(ZoneId.of("Asia/Calcutta"));
        System.out.println("zonedDateTime1: "+zonedDateTime1);

        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("Asia/Dubai"));
        System.out.println("zonedDateTime2: "+zonedDateTime2);

    }
}
