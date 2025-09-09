package defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Adam","Alex","Jenny","Dan","Mike","Eric");
        Collections.sort(list);
        System.out.println("Prior to java 8: "+list);

        //Java *
        List<String> list1 = Arrays.asList("Apple","Grape","Orange","Anjir","Banana","Dragonfruit");

        list1.sort(Comparator.naturalOrder());
        System.out.println("In Java 8: "+list1);
    }
}
