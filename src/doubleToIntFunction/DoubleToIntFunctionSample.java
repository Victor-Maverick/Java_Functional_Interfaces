package doubleToIntFunction;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionSample {
    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = (decimalValue)->Double.valueOf(decimalValue).intValue();
        System.out.println(doubleToIntFunction.applyAsInt(10.564));
    }
}
