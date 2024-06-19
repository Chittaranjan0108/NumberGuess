import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Set up the game parameters
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        
        // Create a random number generator
        Random random = new Random();
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        // Set up the scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        boolean guessedCorrectly = false;

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess < targetNumber) {
                System.out.println("Too low!");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempt + " attempts.");
                guessedCorrectly = true;
                break;
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry, you've used all your attempts. The correct number was " + targetNumber + ".");
        }

        scanner.close();
    }
}
