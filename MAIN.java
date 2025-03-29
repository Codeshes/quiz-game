import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {

        // QUESTIONS ARRAY[]

        String[] questions = { "WHAT IS 1+1",
                "WHAT IS 2+2",
                "WHAT IS 3+3",
                "WHAT IS 4+4",
                "WHAT IS 5+5" };
        // OPTIONS array []
        String[][] options = { { "1. 2", "2. 50", "3, 569", "4. 2424" },
                { "1. 2", "2. 50", "3, 4", "4. 2424" },
                { "1. 2", "2. 6", "3, 569", "4. 2424" },
                { "1. 2", "2. 50", "3, 569", "4. 8" },
                { "1. 10", "2. 50", "3, 569", "4. 2424" } };
        // DECLARE VARIABLES[]

        int[] answer = { 1, 3, 2, 4, 1 };
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        // WELCOME MESSAGE[]

        System.out.println("*******************");
        System.out.println("Welcome to My Quiz!");
        System.out.println("*******************");

        // QUESTION (loop)

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer: ");
            guess = scanner.nextInt();

            while (guess < 1 || guess > 4) {
                System.out.println("********************************");
                System.out.println("Invalid input. Please try Again!");
                System.out.println("********************************");
                System.out.println("Enter your answer again....");
                System.out.println("********************************");
                guess = scanner.nextInt();
            }

            // CHECK OUR GUESS

            if (guess == answer[i]) {
                System.out.println("**********************");
                System.out.println("The answer is Correct!");
                System.out.println("**********************");
                score++;
            } else {
                System.out.println("********************");
                System.out.println("The answer is wrong!");
                System.out.println("********************");
            }

        }
        // DISPLAY FINAL SCORE
        System.out.println("\n*******************");
        System.out.println("Your final score is: " + score + " out of " + questions.length);
        System.out.println("*******************");
        scanner.close();
    }

}
