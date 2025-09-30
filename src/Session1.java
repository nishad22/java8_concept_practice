import java.time.LocalDate;
import java.time.Period;

public class Session1 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(1985,01,23);

        System.out.println(localDate1.until(localDate).getYears());
    }
}
