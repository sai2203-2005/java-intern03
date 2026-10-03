import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int number = random.nextInt(100) + 1;

        int guess;
        int attempts = 0;

        System.out.println("=================================");
        System.out.println("       NUMBER GUESSING GAME");
        System.out.println("=================================");
        System.out.println("I have generated a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (true) {

            System.out.print("\nEnter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess < number) {
                System.out.println("Too LOW! Try a higher number.");
            } 
            else if (guess > number) {
                System.out.println("Too HIGH! Try a lower number.");
            } 
            else {
                System.out.println("\n Congratulations!");
                System.out.println("You guessed the correct number: " + number);
                System.out.println("Number of attempts: " + attempts);
                break;
            }
        }

        sc.close();
    }
}
