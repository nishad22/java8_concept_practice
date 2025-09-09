package imperativevsdeclarativestyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5, 6, 7, 3, 5, 6);
        List<Integer> uniqueList = new ArrayList<>();
        // Imperative programming style
        for (int i : integerList) {
            if (!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        }
        System.out.println("Imperative programming style :"+uniqueList);

        // Declarative programming style
        uniqueList = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println("Declarative programming style in multithread env :"+uniqueList);

    }
}
