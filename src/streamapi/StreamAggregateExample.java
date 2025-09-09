package streamapi;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamAggregateExample {

    public static void main(String[] args) {

        System.out.println(" sum() :" + IntStream.range(1, 10).sum());
        OptionalInt optionalInt = IntStream.range(1, 10).max();
        System.out.print(" max(): ");
        System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : 0);

        //Imp question
        System.out.println(" count(): " + IntStream.rangeClosed(0, 0).count());

        OptionalLong optionalLong = LongStream.range(1, 10).min();
        System.out.print(" min(): ");
        System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong() : 0);

        OptionalDouble optionalDouble = LongStream.range(1,10).average();
        System.out.print(" average(): ");
        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0);

    }
}
