//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 2.7

/**
 * A simple class to calculate the sum of the digits of a three-digit number.
 */

public class DigitSum {
    public static void main(String[] args) {
        int number = 583;

        int hundreds = number / 100;          // 583 / 100 = 5
        int tens     = (number / 10) % 10;    // 58 % 10    = 8
        int ones     = number % 10;           // 583 % 10   = 3

        int sum = hundreds + tens + ones;

        System.out.println("Number: " + number);
        System.out.println("Digits: " + hundreds + " + " + tens + " + " + ones);
        System.out.println("Sum:    " + sum);
    }
}
