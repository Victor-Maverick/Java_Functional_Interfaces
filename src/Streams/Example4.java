package Streams;

import java.util.List;
import java.util.stream.IntStream;

public class Example4 {
    public static void main(String[] args) {
        String word = "Hello";
        IntStream intStream = word.chars();
        word.chars()
                .filter((number)->number>100)
                .map(number->number*number)
                .forEach(System.out::println);

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        int result = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(result);

        List<Integer> result2 = numbers.stream()
                .sorted()
                .toList();
        System.out.println(result2);
    }
}
