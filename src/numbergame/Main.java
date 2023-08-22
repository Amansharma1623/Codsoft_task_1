package numbergame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the number range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the number range: ");
        int upperBound = scanner.nextInt();

        System.out.print("Enter the maximum number of attempts: ");
        int maxAttempts = scanner.nextInt();

        NumberGame numberGame = new NumberGame(lowerBound, upperBound, maxAttempts);
        numberGame.playGame();
    }
}
