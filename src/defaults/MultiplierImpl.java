package defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {

    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream().reduce(1, (a, b) -> a * b);
    }

    @Override
    public int getSize(List<Integer> integerList) {
        System.out.println("Inside MultiplierImpl() class");
        return Multiplier.super.getSize(integerList);
    }
}
