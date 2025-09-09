package defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,2,3,4);
        int result = multiplier.multiply(integerList);
        System.out.println("result: "+result);
        System.out.println("default method: "+multiplier.getSize(integerList));
        System.out.println("static method: "+Multiplier.isEmpty(integerList));
        System.out.println("override default method: "+multiplier.getSize(integerList));

    }
}
