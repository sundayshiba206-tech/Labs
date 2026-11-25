//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 7.1

/*
 * This class contains simple methods to perform basic mathematical operations.
 * It includes methods to calculate the cube of a number, check if a number is odd,
 * and find the largest of three numbers.
 */

public class SimpleMethods {

    // Method to calculate the cube of a number
    public static int cube(int number) {
        return number * number * number;
    }

    // Method to check if a number is odd
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    // Method to find the largest of three numbers
    public static int maxOfThree(int a, int b, int c) {

        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        return largest;
    }

    public static void main(String[] args) {

        // Call the cube method
        System.out.println("Cube of 3: " + cube(3));

        // Call the isOdd method
        System.out.println("Is 7 odd? " + isOdd(7));

        // Call the maxOfThree method
        System.out.println("Largest number: " + maxOfThree(10, 25, 15));
    }
}
