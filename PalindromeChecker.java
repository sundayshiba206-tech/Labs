//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 9.4

/*
 * This program checks whether a sentence is a palindrome.
 */

public class PalindromeChecker {

    // Check whether a sentence is a palindrome
    public static boolean isPalindrome(String text) {

        // Convert everything to lowercase
        text = text.toLowerCase();

        // Keep only letters and digits
        String cleaned = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                cleaned += ch;
            }
        }

        // Compare characters from both ends
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String sentence = "A man, a plan, a canal: Panama";

        if (isPalindrome(sentence)) {
            System.out.println("\"" + sentence + "\" is a palindrome.");
        } else {
            System.out.println("\"" + sentence + "\" is not a palindrome.");
        }
    }
}
