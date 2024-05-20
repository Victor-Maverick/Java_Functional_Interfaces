package longConsumer;

import java.util.function.LongConsumer;

public class LongConsumerSample {
    public static void main(String[] args) {
        LongConsumer longConsumer = System.out::println;
        longConsumer.accept(658594939L);
    }
}
