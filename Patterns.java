//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 5.5

/*
 * Patterns.java
 * 
 * This program prints different patterns.
 */

public class Patterns {
    public static void main(String[] args) {
        int n = 4;

        System.out.println("Right triangle:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\nInverted triangle:");
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\nNumber pyramid:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) System.out.print(col);
            System.out.println();
        }
    }
}
