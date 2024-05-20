package toIntFunction;

import java.util.function.ToIntFunction;

public class ToIntFunctionSample {
    public static void main(String[] args) {
        ToIntFunction<Integer> toIntFunction = (number) -> number * 767;
        System.out.println(toIntFunction.applyAsInt(12));

    }
}
