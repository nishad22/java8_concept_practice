package timeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    public static void main(String[] args) {
        System.out.println("parse string to date: ");
        parseLocalDate();
        formatLocalDate();
    }

    private static void formatLocalDate() {
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate = LocalDate.now();
        String date = localDate.format(dateTimeFormatter1);
        System.out.println("format date to string: "+date);
    }

    private static void parseLocalDate() {
        String date = "2018-04-29";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("localDate: "+localDate);
        //below will work as line14
        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("localDate: "+localDate1);

        String date1 = "20180429"; //yyyymmdd
        LocalDate localDate2 = LocalDate.parse(date1,DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate2: "+localDate2);

        // custom defined formatter
        String date2 = "2018|04|29";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(date2,dateTimeFormatter);
        System.out.println("localDate3: "+localDate3);


        String date3 = "2018*04*29";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate4 = LocalDate.parse(date3,dateTimeFormatter1);
        System.out.println("localDate4: "+localDate4);
    }
}
