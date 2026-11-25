//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 9.1

/*
 * This program demonstrates basic string operations in Java.
 * It reads a sentence from the user, displays its length,
 * first and last characters, and converts it to uppercase and lowercase.
 */

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Display the length
        System.out.println("Length: " + sentence.length());

        // Check that the sentence is not empty
        if (!sentence.isEmpty()) {
            System.out.println("First character: " + sentence.charAt(0));

            System.out.println("Last character: "
                    + sentence.charAt(sentence.length() - 1));
        } else {
            System.out.println("The sentence is empty.");
        }

        // Convert the sentence to uppercase and lowercase
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());

        input.close();
    }
}
