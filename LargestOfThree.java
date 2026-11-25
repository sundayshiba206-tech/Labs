//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 4.3

/*
 * This program prompts the user to enter three integers and determines the largest of the three.
 * It uses conditional statements to compare the integers and find the maximum value.
 */

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();

        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("Largest: " + largest);
    }
}
