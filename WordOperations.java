//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 9.5

/*
 * This program performs various operations on words in a sentence.
 * It counts the number of words, finds the longest word,
 * and prints each word separately.
 */

public class WordOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();

        // Handle an empty sentence
        if (sentence.isEmpty()) {
            System.out.println("Number of words: 0");
            System.out.println("There is no longest word.");
            input.close();
            return;
        }

        // Split the sentence into individual words
        String[] words = sentence.split("\\s+");

        // Count the words
        System.out.println("Number of words: " + words.length);

        // Find the longest word
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);

        // Print each word separately
        System.out.println("\nIndividual words:");

        for (String word : words) {
            System.out.println(word);
        }

        input.close();
    }
}
