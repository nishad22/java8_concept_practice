package timeapi;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {
        //localtime
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime: "+localTime);

        LocalTime localTime1 = LocalTime.of(12,18);
        System.out.println("LocalTime1: "+localTime1);

        LocalTime localTime2 = LocalTime.of(12,19,50);
        System.out.println("LocalTime: "+localTime2);

        LocalTime localTime3 = LocalTime.of(12,19,50,32342);
        System.out.println("LocalTime: "+localTime3);

        //how to get hour, minute and second
        System.out.println("getHour(): "+localTime.getHour());
        System.out.println("getMinute(): "+localTime.getMinute());
        System.out.println("clock hour of the day: "+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("toSecondOfDay: "+localTime.toSecondOfDay()); //represent the time in second

        //how to modify the times
        System.out.println("localtime minus(): "+localTime.minusHours(2));
        System.out.println("localtime hours(): "+localTime.minus(2, ChronoUnit.HOURS));
        System.out.println("MIDNIGHT: "+localTime.with(LocalTime.MIDNIGHT));
        System.out.println("Hour of day: "+localTime.with(ChronoField.HOUR_OF_DAY,18));
        System.out.println("plusMinute(): "+localTime.plusMinutes(30));
        System.out.println("withhour(): "+localTime.withHour(10));
    }
}
