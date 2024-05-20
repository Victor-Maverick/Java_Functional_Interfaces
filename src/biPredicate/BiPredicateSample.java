package biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (firstWord, number)-> firstWord.length() == number;
        System.out.println(biPredicate.test("names", 8));

        BiPredicate<Integer, Integer>biPredicate1 = (firstNumber, secondNumber) -> firstNumber < secondNumber;
        System.out.println(biPredicate1.test(11, 22));
    }
}
