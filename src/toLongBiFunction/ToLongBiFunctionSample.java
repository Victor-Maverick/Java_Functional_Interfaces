package toLongBiFunction;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionSample {
    public static void main(String[] args) {
        ToLongBiFunction<Integer, Double> toLongBiFunction
                = (number, doubleValue)->Double.valueOf(number*doubleValue).longValue();
        System.out.println(toLongBiFunction.applyAsLong(3, 2.579));
    }
}
