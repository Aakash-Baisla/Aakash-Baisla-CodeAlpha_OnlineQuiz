import java.util.Scanner;

public class OnlineQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions and answers
        String[] questions = {
                "What is the capital of France?",
                "Which programming language is known as platform-independent?",
                "What is 5 + 3?",
                "Who wrote 'Hamlet'?"
        };

        String[][] options = {
                {"1. Paris", "2. London", "3. Rome", "4. Berlin"},
                {"1. C", "2. Java", "3. Python", "4. JavaScript"},
                {"1. 6", "2. 7", "3. 8", "4. 9"},
                {"1. Charles Dickens", "2. J.K. Rowling", "3. William Shakespeare", "4. George Orwell"}
        };

        int[] answers = {1, 2, 3, 3}; // Correct answers
        int score = 0;

        System.out.println("Welcome to the Online Quiz Platform!");
        System.out.println("Answer the following questions by selecting the correct option (1-4).");
        System.out.println("--------------------------------------------------");

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + answers[i]);
            }
            System.out.println("--------------------------------------------------");
        }

        // Final score
        System.out.println("Quiz Completed!");
        System.out.println("Your final score is: " + score + " out of " + questions.length);
        System.out.println("Thank you for playing!");

        scanner.close();
    }
}
