package functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1 = (i) -> {return i % 2 == 0;};
    static Predicate<Integer> p2 = (i) -> {return i % 5 == 0;};

    private static void predicateAnd(){
        //predicate chaining
        System.out.println("The predicate and 10: "+p1.and(p2).test(10));
        System.out.println("The predicate and 8: "+p1.and(p2).test(8));
    }

    private static void predicateOr(){
        //predicate chaining
        System.out.println("The predicate or 10: "+p1.or(p2).test(10));
        System.out.println("The predicate or 8: "+p1.or(p2).test(8));
    }

    private static void predicateNegate(){
        //predicate chaining
        System.out.println("The predicate negate 10: "+p1.or(p2).negate().test(10));
    }

    public static void main(String[] args) {

        //improved version
        Predicate<Integer> perdicate1 = (i) -> i % 2 == 0;
        System.out.println("The predicate1 ans: " + perdicate1.test(5));
        System.out.println("-------------And---------------");
        predicateAnd();
        System.out.println("--------------OR--------------");
        predicateOr();
        System.out.println("--------------Negate--------------");
        predicateNegate();
    }
}
