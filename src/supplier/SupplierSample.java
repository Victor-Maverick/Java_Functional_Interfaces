package supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt();
        System.out.println(supplier.get());

        Supplier<String> stringSupplier = ()-> "Welcome";
        System.out.println(stringSupplier.get());
    }


}
