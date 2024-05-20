package Streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Transaction> transactions =
                List.of(new Transaction("$2000", "26748"), new Transaction("$1000", "47858"));
        transactions.stream()
                .filter(transaction -> new BigDecimal(transaction.getAmount().substring(1)).compareTo(new BigDecimal(100))>0)
                .forEach(System.out::println);
    }
}
