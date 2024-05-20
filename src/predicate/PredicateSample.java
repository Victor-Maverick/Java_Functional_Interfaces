package predicate;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (number) -> number > 10;
        System.out.println(predicate.test(10));

        Predicate<String> predicate2 = String::isEmpty;
        System.out.println(predicate2.test(""));
        System.out.println(predicate2.test("name"));
    }
}
