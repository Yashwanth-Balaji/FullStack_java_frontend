import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        // Lambda expression implementing Supplier interface
        Supplier<String> messageSupplier = () -> "this is the data I am returning";

        // Call the get() method
        System.out.println(messageSupplier.get());
    }
}
