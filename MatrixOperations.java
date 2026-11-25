//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 8.7

/*
 * This program demonstrates how to perform operations on a 3 by 3 matrix in Java.
 * It collects nine integers from the user to fill the matrix, calculates the sum of each row,
 * the sum of each column, and the sum of the main diagonal, and then prints these sums.
 */

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        // Read the matrix values
        System.out.println("Enter 9 integers for the 3 by 3 matrix:");

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print("Enter value at [" + row + "][" + column + "]: ");
                matrix[row][column] = input.nextInt();
            }
        }

        // Print the matrix
        System.out.println("\nMatrix:");

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(matrix[row][column] + "\t");
            }
            System.out.println();
        }

        // Calculate each row sum
        for (int row = 0; row < 3; row++) {
            int sum = 0;

            for (int column = 0; column < 3; column++) {
                sum += matrix[row][column];
            }

            System.out.println("Sum of row " + (row + 1) + ": " + sum);
        }

        // Calculate each column sum
        for (int column = 0; column < 3; column++) {
            int sum = 0;

            for (int row = 0; row < 3; row++) {
                sum += matrix[row][column];
            }

            System.out.println("Sum of column " + (column + 1) + ": " + sum);
        }

        // Calculate the main diagonal sum
        int diagonalSum = 0;

        for (int i = 0; i < 3; i++) {
            diagonalSum += matrix[i][i];
        }

        System.out.println("Main diagonal sum: " + diagonalSum);

        input.close();
    }
}
