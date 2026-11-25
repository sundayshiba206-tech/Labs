//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 5.4

/*
 * MultiplicationTable.java
 * 
 * This program prints the multiplication table for a given number.
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        in.close();

        System.out.printf("%2s x %2s = %4s%n", "n", "i", "result");
        System.out.println("---------------");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%2d x %2d = %4d%n", n, i, n * i);
        }
    }
}
