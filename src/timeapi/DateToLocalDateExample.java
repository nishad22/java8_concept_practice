package timeapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {

    public static void main(String[] args) {

        // java.util.date to LocalDate and vice-versa
        Date date = new Date();
        System.out.println("Date: "+date);

        // date to Localdate
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("date to Localdate: "+localDate);

        // LocalDate to date
        Date result = Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("LocalDate to date: "+result);

        //java.sql.date to LocalDate and vice-versa
        java.sql.Date date2 = java.sql.Date.valueOf(localDate);
        System.out.println("LocalDate to java.sql.date : "+date2);

        LocalDate localDate1 = date2.toLocalDate();
        System.out.println("LocalDate to java.sql.date: "+localDate1);




    }
}
