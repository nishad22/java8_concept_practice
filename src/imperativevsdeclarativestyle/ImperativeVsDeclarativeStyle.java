package imperativevsdeclarativestyle;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeStyle {
    public static void main(String[] args) {
        int sum  = 0;
        for (int i=0;i<=10;i++){
            sum+=i;
        }
        System.out.println("Imperative programming style :"+sum);

        int sum1 = IntStream.rangeClosed(0,10)
                .sum();
        System.out.println("Declarative programming style :"+sum1);

        //if the above code need to be used in multithreaded env
        int sum2 = IntStream.rangeClosed(0,10)
                .parallel()
                .sum();
        System.out.println("Declarative programming style in multithread env :"+sum2);

    }
}
