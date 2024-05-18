package consumer;

import java.util.function.Consumer;

public class ConsumeSample {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(176);
        consumer.accept(177);

        Consumer<String> stringConsumer = (word) -> System.out.println("You entered "+word);
        stringConsumer.accept("Hello");
    }
}
