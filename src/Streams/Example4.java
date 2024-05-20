package Streams;

import java.util.stream.IntStream;

public class Example4 {
    public static void main(String[] args) {
        String word = "Hello";
        IntStream intStream = word.chars();
        word.chars()
                .filter((number)->number>100)
                .map(number->number*number)
                .forEach(System.out::println);
    }
}
