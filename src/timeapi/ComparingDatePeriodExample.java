package timeapi;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatePeriodExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2022,6,12);
        LocalDate localDate1 = LocalDate.of(2023, 12,21);

        Period period = localDate.until(localDate1);

        System.out.println("getDays(): "+period.getDays()); //it will get  diff between days and subtract 21 - 12
        System.out.println("getMonths(): "+period.getMonths());
        System.out.println("getYears(): "+period.getYears());

        Period period1 = Period.ofDays(10);
        System.out.println("getDays(): "+period1.getDays());

        Period period2 = Period.ofYears(10);
        System.out.println("getYears(): "+period2.getYears());
        System.out.println("getDays(): "+period2.toTotalMonths());

        Period period3 = Period.between(localDate,localDate1);
        System.out.println("Period between(): "+period3.getDays()+" : "+period3.getMonths()+" : "+period3.getYears());


    }
}
