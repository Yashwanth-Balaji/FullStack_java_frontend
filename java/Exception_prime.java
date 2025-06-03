import java.util.Scanner;

// Custom exception for prime check
class Prime extends Exception {
    Prime(String message) {
        super(message);
    }
}

public class Exception_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        try {
            if (num <= 1) {
                throw new Prime("Number must be greater than 1 to check for primality.");
            }

            boolean isNotPrime = false;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isNotPrime = true;
                    break;
                }
            }

            if (isNotPrime) {
                throw new Prime("This is Not Prime Exception");
            } else {
                throw new Prime("This is Prime Exception");
            }

        } catch (Prime e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
