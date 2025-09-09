package lambda;

import java.util.Comparator;

public class ComparatorImpl {
    public static void main(String[] args) {

        /*prior to java 8*/
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1 == o2 --> 0
                //o1 > o2 --> 1
                //o1<o2 --> -1
                return o1.compareTo(o2);
            }
        };
        System.out.println("The result of comparator: "+comparator.compare(1,2));

        Comparator<Integer> comparatorLambda = (Integer o1, Integer o2) -> {
            return o1.compareTo(o2);
        };

        System.out.println("Using Lambda: "+comparatorLambda.compare(1,1));

        Comparator<Integer> comparatorLambda1 = (Integer o1, Integer o2) ->  o1.compareTo(o2);
        System.out.println("Using Lambda in one line: "+comparatorLambda1.compare(2,1));


        Comparator<Integer> comparatorLambda2 = Integer::compareTo;
        System.out.println("Using Lambda with method reference: "+comparatorLambda1.compare(0,1));





    }
}
