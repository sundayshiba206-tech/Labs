//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 8.3

/*
 * This program demonstrates how to reverse an array in Java.
 * It first prints the original array in reverse order, then creates a new array
 * that contains the reversed values, and finally prints both the reversed copy
 * and the original array to show that it has not changed.
 */

import java.util.Scanner;

public class LinearSearch {

    // Search for a value and return its index
    public static int indexOf(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = {12, 25, 34, 47, 56, 68, 79};

        System.out.print("Enter a number to search for: ");
        int target = input.nextInt();

        int position = indexOf(numbers, target);

        if (position != -1) {
            System.out.println("Number found at index: " + position);
            System.out.println("Position in the array: " + (position + 1));
        } else {
            System.out.println("Number was not found.");
        }

        input.close();
    }
}
