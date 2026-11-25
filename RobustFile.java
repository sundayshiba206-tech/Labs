//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 3.7

/*
 * This program reads a list of integers from a file named "scores.txt", 
 * calculates the sum, largest value, and average of the integers, 
 * and displays the results.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RobustFile {
    public static void main(String[] args) {

        // Specify the file location
        File file = new File("scores.txt");

        // Check whether the file exists
        if (!file.exists()) {

            System.out.println("Sorry, scores.txt does not exist.");
            return;
        }

        try (Scanner input = new Scanner(file)) {

            int sum = 0;
            int largest = Integer.MIN_VALUE;
            int count = 0;

            // Read scores from the file
            while (input.hasNextInt()) {

                int score = input.nextInt();

                sum += score;

                if (score > largest) {
                    largest = score;
                }

                count++;
            }

            // Display results
            if (count > 0) {

                double average = (double) sum / count;

                System.out.println("Sum: " + sum);
                System.out.println("Largest: " + largest);
                System.out.printf("Average: %.1f%n", average);

            } else {
                System.out.println("The file contains no valid scores.");
            }

        } catch (FileNotFoundException e) {

            System.out.println("Unable to open scores.txt.");
        }
    }
}
