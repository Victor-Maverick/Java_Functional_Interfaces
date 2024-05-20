package binaryOperator;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = Integer::sum;
        System.out.println(binaryOperator.apply(2, 3));
    }
}
