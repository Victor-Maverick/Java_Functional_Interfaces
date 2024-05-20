package Streams;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 21, 30, 40, 50);
        numbers.stream()
                .filter((number) -> number % 2 != 0)
                .forEach(System.out::println);
    }
}
