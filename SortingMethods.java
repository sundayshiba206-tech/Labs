//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 8.4

/*
 * This program demonstrates how to reverse an array in Java.
 * It first prints the original array in reverse order, then creates a new array
 * that contains the reversed values, and finally prints both the reversed copy
 * and the original array to show that it has not changed.
 */

import java.util.Arrays;

public class SortingMethods {

    // Bubble sort method
    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    // Swap adjacent values
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort method
    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {

            int minimumIndex = i;

            // Find the smallest value in the unsorted section
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            // Swap the smallest value into its correct position
            int temp = numbers[i];
            numbers[i] = numbers[minimumIndex];
            numbers[minimumIndex] = temp;
        }
    }

    // Test all three sorting methods
    public static void testSorting(String label, int[] original) {
        int[] bubble = original.clone();
        int[] selection = original.clone();
        int[] builtIn = original.clone();

        bubbleSort(bubble);
        selectionSort(selection);
        Arrays.sort(builtIn);

        System.out.println("\n" + label);
        System.out.println("Original:        " + Arrays.toString(original));
        System.out.println("Bubble sort:     " + Arrays.toString(bubble));
        System.out.println("Selection sort:  " + Arrays.toString(selection));
        System.out.println("Arrays.sort:     " + Arrays.toString(builtIn));
    }

    public static void main(String[] args) {

        int[] sorted = {1, 2, 3, 4, 5, 6};
        int[] reversed = {6, 5, 4, 3, 2, 1};
        int[] random = {4, 1, 6, 2, 5, 3};

        testSorting("SORTED DATA", sorted);
        testSorting("REVERSED DATA", reversed);
        testSorting("RANDOM DATA", random);
    }
}
