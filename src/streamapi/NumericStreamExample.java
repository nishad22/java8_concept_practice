package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        int result = list.stream().reduce(0,(a,b) -> a+b);
        System.out.println("the result of reduce function: "+result);

        //in the above example type casting is happening for Integer to int
        // to avoid this we can use IntStream

        int resultIntStream = IntStream.rangeClosed(1,6).sum();
        System.out.println("IntStream result: "+resultIntStream);
    }
}
