package timeapi;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class LocalDateExample {

    public static void main(String[] args) {

        //LocalDate create object
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate: "+localDate);

        LocalDate l1 = LocalDate.of(2025,9,20);
        System.out.println("created using of(): "+l1);

        LocalDate l2 = LocalDate.ofYearDay(1998,22);
        System.out.println("createed using ofYearDay(): "+l2);

        //getting value from LocalDate
        System.out.println("getMonth(): "+localDate.getMonth());
        System.out.println("getMonthValue(): "+localDate.getMonthValue());
        System.out.println("getDayOfWeek(): "+localDate.getDayOfWeek());
        System.out.println("getDayOfYear(): "+localDate.getDayOfYear());
        System.out.println("day of the month using get(): "+localDate.get(ChronoField.DAY_OF_YEAR));

        //modifying the LocalDate Instance
        System.out.println("plusDays(): "+localDate.plusDays(22));
        System.out.println("plusMonths(): "+localDate.plusMonths(4));
        System.out.println("minusDays(): "+localDate.minusDays(33));
        System.out.println("withYear(): "+localDate.withYear(2206).getDayOfWeek());
        System.out.println("with Chronofield: "+localDate.with(ChronoField.YEAR,2026));
        System.out.println("with chrono unit: "+localDate.minus(1, ChronoUnit.YEARS));

        //additional support method
        System.out.println("current year is leap year or not: "+localDate.isLeapYear());
        System.out.println("isLeapYear(): "+LocalDate.ofYearDay(2020,1).isLeapYear());

        //check two dates equal or not
        System.out.println("check two dates: "+localDate.isEqual(l1));
        System.out.println("isBefore: "+localDate.isBefore(l2));
        System.out.println("isAfter: "+localDate.isAfter(l2));

        //isSupport() -> can be used to check whether to operation can be performed on LocalDate
        System.out.println("isSupported(): "+localDate.isSupported(ChronoUnit.MINUTES));

    }
}
