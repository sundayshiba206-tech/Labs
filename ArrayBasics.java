//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 8.1

/*
 * This program demonstrates basic array operations in Java.
 * It collects ten integers from the user, calculates the sum and average,
 * finds the maximum and minimum values, and counts how many values are above the average.
 */

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0;

        // Collect ten integers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        int maximum = numbers[0];
        int minimum = numbers[0];
        int aboveAverage = 0;

        // Find maximum, minimum and values above average
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }

            if (number < minimum) {
                minimum = number;
            }

            if (number > average) {
                aboveAverage++;
            }
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Values above average: " + aboveAverage);

        input.close();
    }
}
