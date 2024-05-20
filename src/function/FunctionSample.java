package function;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<String,Integer> function = String::length;
        System.out.println(function.apply("Gagnon"));
        Function<Integer, Integer> function1 = (number)-> number * 12;
        System.out.println(function1.apply(12));
    }
}
