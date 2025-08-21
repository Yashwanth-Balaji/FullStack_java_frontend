import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        // Lambda expression to check if a number is even
        Predicate<Integer> isEven = (Integer val) -> {
            if (val % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        // Test the predicate
        System.out.println(isEven.test(10));  // Output: true
        System.out.println(isEven.test(7));   // Output: false
    }
}
