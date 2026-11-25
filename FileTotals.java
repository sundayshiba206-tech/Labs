//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 3.5

/*
 * This program reads a list of integers from a file named "scores.txt", 
 * calculates the sum, largest value, and average of the integers, 
 * and displays the results.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTotals {
    public static void main(String[] args) {

        // Locate the scores file
        File file = new File("scores.txt");

        try {
            // Read the file
            Scanner input = new Scanner(file);

            int sum = 0;
            int largest = Integer.MIN_VALUE;
            int count = 0;

            // Read all integers in the file
            while (input.hasNextInt()) {

                int score = input.nextInt();

                // Add each score to the sum
                sum = sum + score;

                // Find the largest score
                if (score > largest) {
                    largest = score;
                }

                count++;
            }

            input.close();

            // Calculate and display results
            if (count > 0) {

                double average = (double) sum / count;

                System.out.println("Sum: " + sum);
                System.out.println("Largest value: " + largest);
                System.out.printf("Average: %.1f%n", average);

            } else {
                System.out.println("No scores found in the file.");
            }

        } catch (FileNotFoundException e) {

            // Display a friendly error message
            System.out.println("Error: scores.txt was not found.");
        }
    }
}
