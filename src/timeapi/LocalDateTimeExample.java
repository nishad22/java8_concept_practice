package timeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: "+localDateTime);

        LocalDateTime l1 = LocalDateTime.of(2018,8,15,15,14,59,39291);
        System.out.println(l1);

        LocalDateTime l2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(l2);

        //get value from LocalDateTime
        System.out.println("getHour(): "+localDateTime.getHour());
        System.out.println("getMinute(): "+localDateTime.getMinute());
        System.out.println("getDayOfMonth(): "+localDateTime.getDayOfMonth());
        System.out.println("getDayOfYear(): "+localDateTime.getDayOfYear());

        //modify LocalDateTime
        System.out.println("plusdays(): "+localDateTime.plusDays(2));
        System.out.println(localDateTime.withMonth(2));

        //converting localdate, localtime to localdatetime and vice versa
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.atTime(16,20));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.atDate(localDate));

        System.out.println("local date: "+l2.toLocalDate());
        System.out.println("local time: "+l2.toLocalTime());
    }
}
