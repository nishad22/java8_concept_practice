package timeapi;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatLocalDateTime {

    public static void main(String[] args) {
        pasrseTime();
        formatTime();
    }

    private static void formatTime() {
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH|mm|ss");
        LocalTime localTime2 = LocalTime.now();
        System.out.println(localTime2);
        String formatedTime = localTime2.format(dateTimeFormatter1);
        System.out.println("formatTime: "+formatedTime);
    }

    private static void pasrseTime() {
        String time = "13:00";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println("localtime: "+localTime);

        //two argument
        LocalTime l1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("l1: "+l1);

        //custom defined format
        String time1 = "13*00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm"); //if hh has passed it will throw exception
        LocalTime localTime1 = LocalTime.parse(time1,dateTimeFormatter);
        System.out.println("localTime1: "+localTime1);

        String time2 = "13*00*03";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH*mm*ss"); //if hh has passed it will throw exception
        LocalTime localTime2 = LocalTime.parse(time2,dateTimeFormatter1);
        System.out.println("localTime3: "+localTime2);
    }
}
