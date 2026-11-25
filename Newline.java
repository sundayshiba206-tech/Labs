//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 3.3

/*
 * This program prompts the user to enter their age and full name, 
 * and then displays the information back to the user.
 */

import java.util.Scanner;

public class Newline {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user to enter an integer
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Clear the leftover newline
        input.nextLine();

        // Ask for the user's full name
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        // Display the information
        System.out.println("\nYour Details");
        System.out.println("Age: " + age);
        System.out.println("Full Name: " + fullName);

        input.close();
    }
}
