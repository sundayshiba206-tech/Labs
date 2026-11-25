//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 5.7

/*
 * GuessingGame.java
 * 
 * This program plays a simple guessing game.
 */

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int secret = (int) (Math.random() * 100) + 1;   // 1..100
        int attempts = 0;

        System.out.println("I'm thinking of a number from 1 to 100.");

        while (true) {
            System.out.print("Your guess: ");
            int guess = in.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Out of range — guess 1..100.");
                continue;   // don't count invalid guesses? — see note below
            }

            if (guess == secret) {
                System.out.println("Correct! You got it in " + attempts + " attempts.");
                break;
            } else if (guess > secret) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }
        in.close();
    }
}
