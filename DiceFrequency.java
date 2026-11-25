//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 8.6

/*
 * This program simulates rolling a six-sided die 60 times and counts the frequency of each face.
 * It uses an array to store the frequency of each face and prints the results after all rolls.
 */

import java.util.Random;

public class DiceFrequency {
    public static void main(String[] args) {

        Random random = new Random();

        // Indexes 1 to 6 represent the six dice faces
        int[] frequency = new int[7];

        // Generate 60 random dice throws
        for (int i = 0; i < 60; i++) {
            int dice = random.nextInt(6) + 1;
            frequency[dice]++;
        }

        // Display the frequency of each face
        System.out.println("Dice frequency after 60 throws:");

        for (int face = 1; face <= 6; face++) {
            System.out.println("Face " + face + ": " + frequency[face]);
        }
    }
}
