// Define the functional interface
@FunctionalInterface
interface Bird {
    void canFly(String val);
}

// Updated class name
public class LambdaDemo {
    public static void main(String[] args) {

        // Lambda expression implementing the Bird interface
        Bird eagleObject = (String value) -> {
            System.out.println("Eagle Bird Implementation");
        };

        // Calling the method
        eagleObject.canFly("vertical");
    }
}
