import java.util.*;

public class OccurrenceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        input = input.toLowerCase();

        Map<String, Integer> wordMap = new HashMap<>();

        // Split the input string into words using space as delimiter
        String[] words = input.split("\\s+");

        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word occurrences:");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
