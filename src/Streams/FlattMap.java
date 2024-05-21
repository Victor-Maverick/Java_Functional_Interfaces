package Streams;

import java.util.List;
import java.util.stream.Stream;

public class FlattMap {
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(
                List.of(1,2,3,4,5),
                List.of(10,20,30,40,50),
                List.of(100,200,300,400,500)
        );
        System.out.println(lists.stream()
                .flatMap(list -> list.stream())
                .toList());
        List<String> stringList = List.of(
                "ABC", "HELLO", "Hey"
        );
        System.out.println(stringList.stream()
                .flatMap((element) ->
                        Stream.of(new StringBuilder(element).reverse()))
                .toList());
    }
}
