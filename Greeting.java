//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 3.1

/*
 * This program prompts the user to enter their first and last name, 
 * and then displays a welcome message using the provided names.
 */

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        // Create Scanner to receive user input
        Scanner input = new Scanner(System.in);

        // Ask for first name
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        // Ask for last name
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        // Display the welcome message
        System.out.println("Welcome, " + lastName + " " + firstName);

        input.close();
    }
}

