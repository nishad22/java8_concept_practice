package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatTwoString {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        Stream<String> stream = Stream.concat(list1.stream(),list2.stream());
        stream.forEach(str -> System.out.print(str + " "));

        String string = list1.stream().reduce(" ",(a,b) -> a.concat(" ").concat(b));
        System.out.println("\nusing reduce(): "+string);

        String result = list2.stream().reduce(" ",(a,b) -> a.concat(" ").concat(b));
        System.out.println(result);
    }
}
