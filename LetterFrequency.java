//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 9.8

/*
 * This program counts the frequency of each letter in a paragraph.
 */

public class LetterFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store the frequency of 26 letters
        int[] frequency = new int[26];

        // Read a paragraph
        System.out.println("Enter a paragraph:");
        String paragraph = input.nextLine();

        // Count each letter
        for (int i = 0; i < paragraph.length(); i++) {
            char ch = Character.toLowerCase(paragraph.charAt(i));

            // Check whether the character is a letter
            if (ch >= 'a' && ch <= 'z') {

                // Calculate the array index
                int index = ch - 'a';

                // Increase the frequency
                frequency[index]++;
            }
        }

        // Print the frequency table
        System.out.println("\nLETTER FREQUENCY TABLE");
        System.out.println("---------------------");

        for (int i = 0; i < 26; i++) {
            char letter = (char) ('A' + i);

            System.out.println(letter + " : " + frequency[i]);
        }

        input.close();
    }
}
