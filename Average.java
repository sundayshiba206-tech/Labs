//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 3.2

/*
 * This program prompts the user to enter three test scores, 
 * calculates the average of those scores, and displays the result.
 */

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read three test scores
        System.out.print("Enter first test score: ");
        double score1 = input.nextDouble();

        System.out.print("Enter second test score: ");
        double score2 = input.nextDouble();

        System.out.print("Enter third test score: ");
        double score3 = input.nextDouble();

        // Calculate the average
        double average = (score1 + score2 + score3) / 3.0;

        // Display average to one decimal place
        System.out.printf("Average score: %.1f%n", average);

        input.close();
    }
}
