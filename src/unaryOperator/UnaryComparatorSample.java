package unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryComparatorSample {
    public static void main(String[] args) {
        UnaryOperator<Integer>unaryOperator = (number) -> number * 23;
        System.out.println(unaryOperator.apply(23));

        UnaryOperator<String> unaryOperatorString = String::toUpperCase;
        System.out.println(unaryOperatorString.apply("Hello"));
    }
}
