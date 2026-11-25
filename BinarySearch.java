//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 8.5

/*
 * This program demonstrates how to reverse an array in Java.
 * It first prints the original array in reverse order, then creates a new array
 * that contains the reversed values, and finally prints both the reversed copy
 * and the original array to show that it has not changed.
 */

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    // Perform binary search and count comparisons
    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int comparisons = 0;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            comparisons++;

            if (numbers[middle] == target) {
                System.out.println("Comparisons made: " + comparisons);
                return middle;
            }

            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        System.out.println("Comparisons made: " + comparisons);
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = {45, 12, 78, 23, 9, 56, 34};

        // Binary search requires sorted data
        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));

        System.out.print("Enter number to search for: ");
        int target = input.nextInt();

        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Number found at index: " + result);
        } else {
            System.out.println("Number not found.");
        }

        input.close();
    }
}
