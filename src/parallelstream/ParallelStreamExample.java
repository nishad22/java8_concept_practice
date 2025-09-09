package parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {
        System.out.println("sequentialStream(): "+sequentialStream());
        System.out.println("parallelStream(): "+parallelStream());

        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    private static int sequentialStream(){
        return IntStream.rangeClosed(1,10)
                .sum();
    }

    private static int parallelStream(){
        return IntStream.rangeClosed(1,10)
                .parallel()
                .sum();
    }
}
