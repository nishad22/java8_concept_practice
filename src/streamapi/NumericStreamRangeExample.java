package streamapi;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NumericStreamRangeExample {

    public static void main(String[] args) {

        IntStream integerIntStream = IntStream.range(1,10);
        System.out.println("The count of range: "+integerIntStream.count());
        System.out.println();
        IntStream.range(1,10).forEach(value -> System.out.print(value+" "));
        System.out.println();
        System.out.print("range closed count: "+IntStream.rangeClosed(1,10).count());
        System.out.println();
        IntStream.rangeClosed(1,10).forEach(value -> System.out.print(value+" "));

        //Double Stream dont have the range/rangeclosed method so we do like below
//        System.out.println();
        DoubleStream doubleStream = IntStream.range(1,10).asDoubleStream();
        System.out.println("The count of doubleStream: "+doubleStream.count());
//        System.out.println();
        IntStream.range(1,10).asDoubleStream().forEach(value -> System.out.print(value+" "));
    }
}
