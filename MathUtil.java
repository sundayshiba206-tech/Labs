//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 7.5

/*
 * This class contains utility methods for mathematical operations.
 * It includes methods to check if a number is prime, calculate the factorial of a number,
 * find the greatest common divisor (GCD), and calculate the power of a number.
 */

public class MathUtil {

    // Check whether a number is prime
    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Calculate the factorial of a number
    public static long factorial(int number) {

        if (number < 0 || number > 20) {
            throw new IllegalArgumentException(
                "Enter a number between 0 and 20."
            );
        }

        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    // Find the greatest common divisor
    public static int gcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {

            int remainder = a % b;

            a = b;
            b = remainder;
        }

        return a;
    }

    // Calculate the power of a number
    public static double power(double base, int exponent) {

        if (exponent < 0) {
            throw new IllegalArgumentException(
                "Exponent must not be negative."
            );
        }

        double result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {

        // Test isPrime with four values
        System.out.println("PRIME TESTS");
        System.out.println(isPrime(2));
        System.out.println(isPrime(7));
        System.out.println(isPrime(9));
        System.out.println(isPrime(17));

        // Test factorial with four values
        System.out.println("\nFACTORIAL TESTS");
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(5));
        System.out.println(factorial(7));

        // Test GCD with four pairs
        System.out.println("\nGCD TESTS");
        System.out.println(gcd(48, 18));
        System.out.println(gcd(20, 10));
        System.out.println(gcd(35, 14));
        System.out.println(gcd(100, 25));

        // Test power with four values
        System.out.println("\nPOWER TESTS");
        System.out.println(power(2, 3));
        System.out.println(power(3, 2));
        System.out.println(power(5, 2));
        System.out.println(power(10, 0));
    }
}
