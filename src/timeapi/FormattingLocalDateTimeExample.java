package timeapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {

    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }

    private static void formatLocalDateTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd'abc'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String result = dateTimeFormatter.format(localDateTime);
        System.out.println("formatted: " + result);
    }

    private static void parseLocalDateTime() {

        String dateTime = "2025-09-21T21:43:09.033877200";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println("localDateTime: " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("localDateTime1: " + localDateTime1);

        //custom defined format
        String dateTime1 = "2025*09*21T21*43*09";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy*MM*dd'T'HH*mm*ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
        System.out.println("localDateTime2: " + localDateTime2);


    }
}
