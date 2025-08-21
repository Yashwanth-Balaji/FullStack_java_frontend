import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        // Lambda expression implementing the accept method of Consumer
        Consumer<Integer> loggingObject = (Integer val) -> {
            if (val > 10) {
                System.out.println("Logging");
            }
        };

        // Calling the accept method
        loggingObject.accept(11);
    }
}
