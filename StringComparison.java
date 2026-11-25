//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 9.2

/*
 * This program demonstrates string comparison operations in Java.
 * It reads two words from the user and compares them in various ways.
 */

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read two words
        System.out.print("Enter the first word: ");
        String word1 = input.next();

        System.out.print("Enter the second word: ");
        String word2 = input.next();

        // Check whether the words are exactly equal
        System.out.println("Are they equal? " + word1.equals(word2));

        // Compare without considering letter case
        System.out.println("Equal ignoring case? "
                + word1.equalsIgnoreCase(word2));

        // Compare alphabetically without considering case
        int result = word1.compareToIgnoreCase(word2);

        if (result < 0) {
            System.out.println(word1 + " comes first alphabetically.");
        } else if (result > 0) {
            System.out.println(word2 + " comes first alphabetically.");
        } else {
            System.out.println("Both words are alphabetically equal.");
        }

        input.close();
    }
}
