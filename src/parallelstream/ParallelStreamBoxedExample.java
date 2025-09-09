package parallelstream;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxedExample {

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(toList());
        sequentialSum(integerList);
        parallelSum(integerList);
    }

    /**
     * in below 2 method sequentialSum and parallelSum,
     * parallel Stream take time as it perform the unboxing from Integer to int
     * whereas sequential stream will take less time.
     *
     * reason for parallel stream to be slower in some case
     * Parallel streams add overhead for splitting, task scheduling, and combining results; for light operations like Integer addition
     *
     */


    private static void parallelSum(List<Integer> integerList) {
        Long startTime = System.currentTimeMillis();
        int sum = integerList.stream()
                .parallel()
                .reduce(0, Integer::sum);
        Long endTime = System.currentTimeMillis();
        System.out.println("parallelSum(): "+(endTime-startTime));
    }

    private static void sequentialSum(List<Integer> integerList) {
        Long startTime = System.currentTimeMillis();
        int sum = integerList.stream()
                .reduce(0, Integer::sum);
        Long endTime = System.currentTimeMillis();
        System.out.println("sequentialSum(): "+(endTime-startTime));
    }
}
