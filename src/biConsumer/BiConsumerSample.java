package biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, Double> biConsumer = (name, weight)->
                System.out.println(name + " weighs " + weight + " pounds");
        biConsumer.accept("John", 65.4);

        BiConsumer<Integer, Integer> biConsumer2 = (firstNumber,secondNumber)->
                System.out.println(Math.pow(firstNumber,secondNumber));
        biConsumer2.accept(3,4);
    }
}
