package doubleBinaryOperator;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorSample {
    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperator = (firstDouble, secondNumber) -> firstDouble / secondNumber;
        System.out.println(doubleBinaryOperator.applyAsDouble(5.0, 2.0));
    }
}
