import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        // Lambda that converts an Integer to its String representation
        Function<Integer, String> integerToString = (Integer num) -> {
            String output = num.toString();
            return output;
        };

        // Applying the function to an input
        System.out.println(integerToString.apply(64));
    }
}
