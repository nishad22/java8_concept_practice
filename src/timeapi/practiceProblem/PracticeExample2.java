package timeapi.practiceProblem;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class PracticeExample2 {

    public static void main(String[] args) {

        LocalDateTime endtime = LocalDateTime.now();
        LocalDateTime startTime = LocalDateTime.of(2018,8,15,15,14,59,39291);

        System.out.println("year between start and end of project: "+ChronoUnit.YEARS.between(startTime,endtime));
        System.out.println("month between start and end of project: "+ChronoUnit.MONTHS.between(startTime,endtime));
        System.out.println("days between start and end of project: "+ChronoUnit.DAYS.between(startTime,endtime));

        System.out.println("hour of the day: "+startTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println("AMPM of the day: "+startTime.get(ChronoField.AMPM_OF_DAY));

        System.out.println("Month of the year: "+endtime.get(ChronoField.MONTH_OF_YEAR));
        int month = endtime.get(ChronoField.MONTH_OF_YEAR);

        System.out.println(endtime.get(ChronoField.DAY_OF_WEEK));

    }
}
