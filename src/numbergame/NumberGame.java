package numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private final int lowerBound;
    private final int upperBound;
    private final int maxAttempts;
    private int targetNumber;

    public NumberGame(int lowerBound, int upperBound, int maxAttempts) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.maxAttempts = maxAttempts;
        generateTargetNumber();
    }

    private void generateTargetNumber() {
        Random random = new Random();
        targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've chosen a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("Can you guess it?");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                return;
            } else if (userGuess < targetNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        System.out.println("Sorry, you've reached the maximum number of attempts.");
        System.out.println("The correct number was: " + targetNumber);
    }
}
