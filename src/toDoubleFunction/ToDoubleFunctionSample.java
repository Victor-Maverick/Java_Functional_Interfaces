package toDoubleFunction;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionSample {
    public static void main(String[] args) {
        ToDoubleFunction<Integer> toDoubleFunction = Integer::doubleValue;
        System.out.println(toDoubleFunction.applyAsDouble(37));
    }
}
