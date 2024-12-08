import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 42; // Set the secret number
        int maxTries = 5;
        int tries = 0;
        boolean guessedCorrectly = false;

        System.out.println("Guess a number between 1 and 100:");

        while (tries < maxTries) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            tries++;

            if (guess == secretNumber) {
                guessedCorrectly = true;
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed the number in " + tries + " tries.");
        } else {
            System.out.println("Sorry, you've used all your tries. The correct number was " + secretNumber + ". Better luck next time!");
        }
    }
}

