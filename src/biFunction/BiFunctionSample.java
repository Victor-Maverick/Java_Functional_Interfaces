package biFunction;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction = (word, number) -> word.length() == number;
        System.out.println(biFunction.apply("hello", 1));

        BiFunction<Integer,Integer, Boolean> biFunction1 = (number, number2) -> number >= number2;
        System.out.println(biFunction1.apply(29, 45));
    }
}
