package Streams;

import java.util.List;
import java.util.stream.IntStream;

public class FlattMap2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double average = numbers.stream().flatMapToInt((element)-> IntStream.of(element*2))
                .average().orElseThrow(()-> new RuntimeException("No element found"));
        System.out.println(average);
    }
}
