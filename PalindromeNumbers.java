//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 7.7

/*
 * This class contains a method to check whether a number is a palindrome.
 * It includes a method to reverse the digits of a number and compare it with the original number.
 */

public class PalindromeNumbers {

    // Check whether a number is a palindrome
    public static boolean isPalindrome(int n) {

        int original = n;
        int reversed = 0;

        // Reverse the number
        while (n > 0) {

            int digit = n % 10;

            reversed = reversed * 10 + digit;

            n = n / 10;
        }

        // Compare original and reversed numbers
        return original == reversed;
    }

    public static void main(String[] args) {

        System.out.println("Palindrome numbers from 100 to 999:");

        // Check all three-digit numbers
        for (int i = 100; i <= 999; i++) {

            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
