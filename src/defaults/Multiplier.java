package defaults;

import java.util.Collections;
import java.util.List;

public interface Multiplier {

    int multiply(List<Integer> integerList);

    default int getSize(List<Integer> integerList) {
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> integerList) {
        return integerList.isEmpty();
    }
}
