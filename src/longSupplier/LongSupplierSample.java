package longSupplier;

import java.util.Random;
import java.util.function.LongSupplier;

public class LongSupplierSample {
    public static void main(String[] args) {
        LongSupplier longSupplier = ()->new Random().nextLong();
        System.out.println(longSupplier.getAsLong());
    }
}
