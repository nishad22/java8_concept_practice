package streamapi;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Nishad","Dharni","Deora");
        stream.forEach(System.out::println);

        Stream.iterate(1,a -> a*2)
                .limit(10)  //added limit as it will generate infinite stream of element
                .forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random()::nextInt;;
        Stream.generate(integerSupplier)
                .limit(5)  //added limit as it will generate infinite stream of element
                .forEach(System.out::println);

    }
}
