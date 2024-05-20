package doubleToLongFunction;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionSample {
    public static void main(String[] args) {
        DoubleToLongFunction doubleToLongFunction = (doubleValue)->Double.valueOf(doubleValue).longValue();
        System.out.println(doubleToLongFunction.applyAsLong(489303030013.88));
    }
}
