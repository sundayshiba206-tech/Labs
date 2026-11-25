//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 8.2

/*
 * This program demonstrates how to reverse an array in Java.
 * It first prints the original array in reverse order, then creates a new array
 * that contains the reversed values, and finally prints both the reversed copy
 * and the original array to show that it has not changed.
 */

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // Print the original array in reverse order
        System.out.print("Reverse order: ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        // Create a new array to store the reversed values
        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }

        // Print the reversed copy
        System.out.print("\nReversed copy: ");

        for (int number : reversed) {
            System.out.print(number + " ");
        }

        // Print the original to show it has not changed
        System.out.print("\nOriginal array: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
