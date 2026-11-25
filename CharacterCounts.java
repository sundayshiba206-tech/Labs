//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 9.3

/*
 * This program counts the number of vowels, consonants, digits, and spaces in a line of text.
 */

import java.util.Scanner;

public class CharacterCounts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String text = input.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        // Examine each character
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowels++;
            }

            // Check for consonants
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }

            // Check for digits
            else if (Character.isDigit(ch)) {
                digits++;
            }

            // Check for spaces
            else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);

        input.close();
    }
}
