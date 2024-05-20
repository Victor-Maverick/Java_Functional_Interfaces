package Streams;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<String> list = List.of("QWERTY", "ASDFG", "ABCDEFF", "ABC");
        list.stream()
                .map(String::length)
                .forEach(System.out::println);

    }
}
