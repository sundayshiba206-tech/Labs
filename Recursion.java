//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 7.6

/*
 * This class demonstrates the use of recursion in Java.
 * It includes methods to calculate the sum of the first n integers,
 * calculate the power of a number, and reverse a string using recursion.
 */

public class Recursion {

    // Find the sum of the first n integers
    public static int sum(int n) {

        // Base case
        if (n <= 0) {
            return 0;
        }

        // Recursive call
        return n + sum(n - 1);
    }

    // Calculate power using recursion
    public static long power(int base, int exponent) {

        // Base case
        if (exponent == 0) {
            return 1;
        }

        // Recursive call
        return base * power(base, exponent - 1);
    }

    // Reverse a string using recursion
    public static String reverse(String text) {

        // Base case
        if (text.length() <= 1) {
            return text;
        }

        // Recursive call using substring
        return reverse(text.substring(1)) + text.charAt(0);
    }

    public static void main(String[] args) {

        // Test sum method
        System.out.println("Sum of first 5 integers: " + sum(5));

        // Test power method
        System.out.println("2 raised to power 4: " + power(2, 4));

        // Test reverse method
        System.out.println("Reverse of Java: " + reverse("Java"));
    }
}

