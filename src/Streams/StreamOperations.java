package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

    public static List<Integer> getEvenNumbersIn(List<Integer> numbers) {
        return numbers.stream()
                .filter((number)->number%2==0)
                .collect(Collectors.toList());
    }

}
