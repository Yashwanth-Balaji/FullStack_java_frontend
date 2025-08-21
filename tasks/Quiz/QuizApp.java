import java.util.*;

class Player {
    String name;
    int score = 0;
    boolean lifeline1Used = false;
    boolean lifeline2Used = false;

    public Player(String name) {
        this.name = name;
    }
}

class Question {
    String question;
    String[] options;
    int correctOption; // index from 0 to 3
    String lifelineHint;

    public Question(String question, String[] options, int correctOption, String lifelineHint) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
        this.lifelineHint = lifelineHint;
    }

    public void displayQuestion() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
}

public class QuizApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Step 1: Get player details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        Player player = new Player(name);

        // Step 2: Ask if user wants to play
        System.out.print("Are you ready to play the quiz? (yes/no): ");
        String response = sc.nextLine().toLowerCase();
        if (!response.equals("yes")) {
            System.out.println("Game terminated.");
            return;
        }

        // Step 3: Display rules
        System.out.println("\nRULES:");
        System.out.println("- Answer multiple-choice questions.");
        System.out.println("- You have 2 lifelines (used only once).");
        System.out.println("- One wrong answer ends the game.\n");

        // Step 4: Initialize questions
        List<Question> questions = Arrays.asList(
            new Question("What is the capital of India?",
                    new String[]{"Mumbai", "Chennai", "New Delhi", "Kolkata"}, 2,
                    "Hint: It's where the parliament is."),
            new Question("Which language runs in a web browser?",
                    new String[]{"Java", "Python", "C", "JavaScript"}, 3,
                    "Hint: Starts with 'Java' but ends differently."),
            new Question("Which planet is known as the Red Planet?",
                    new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 1,
                    "Hint: It's the fourth planet from the sun.")
        );

        // Step 5: Start quiz loop
        for (Question q : questions) {
            q.displayQuestion();
            System.out.print("Do you want to use a lifeline? (yes/no): ");
            String useLifeline = sc.nextLine().toLowerCase();

            if (useLifeline.equals("yes")) {
                handleLifeline(player, q);
            }

            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();
            sc.nextLine(); // consume newline

            if (answer - 1 == q.correctOption) {
                player.score += 10;
                System.out.println("Correct! Your score: " + player.score + "\n");
            } else {
                System.out.println("Wrong answer! Game Over.");
                System.out.println("Final score: " + player.score);
                return;
            }
        }

        System.out.println("🎉 Congratulations " + player.name + "! You completed the quiz.");
        System.out.println("🏆 Final score: " + player.score);
    }

    public static void handleLifeline(Player player, Question q) {
        if (player.lifeline1Used && player.lifeline2Used) {
            System.out.println("No lifelines left. Please answer the question.");
            return;
        }

        System.out.println("Available Lifelines:");
        if (!player.lifeline1Used) System.out.println("1. 50-50");
        if (!player.lifeline2Used) System.out.println("2. Hint");

        System.out.print("Choose your lifeline: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1 && !player.lifeline1Used) {
            useFiftyFifty(q);
            player.lifeline1Used = true;
        } else if (choice == 2 && !player.lifeline2Used) {
            System.out.println("Lifeline Hint: " + q.lifelineHint);
            player.lifeline2Used = true;
        } else {
            System.out.println("Invalid or already used lifeline. No help this time.");
        }
    }

    public static void useFiftyFifty(Question q) {
        List<Integer> wrongOptions = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (i != q.correctOption) {
                wrongOptions.add(i);
            }
        }
        Collections.shuffle(wrongOptions);
        int remove1 = wrongOptions.get(0);
        int remove2 = wrongOptions.get(1);

        System.out.println("50-50 Applied. Remaining options:");
        for (int i = 0; i < 4; i++) {
            if (i == q.correctOption || i == wrongOptions.get(2)) {
                System.out.println((i + 1) + ". " + q.options[i]);
            }
        }
    }
}