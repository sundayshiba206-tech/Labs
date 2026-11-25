//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 3.6

/*
 * This program prompts the user to enter five names, 
 * saves them to a file named "names.txt", and confirms the save.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReportFile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            // Create the names.txt file
            FileWriter writer = new FileWriter("names.txt");

            // Collect five names
            for (int i = 1; i <= 5; i++) {

                System.out.print("Enter name " + i + ": ");
                String name = input.nextLine();

                // Write the numbered name into the file
                writer.write(i + ". " + name);
                writer.write(System.lineSeparator());
            }

            // Close the file
            writer.close();

            System.out.println("Five names saved successfully.");

        } catch (IOException e) {

            System.out.println("Error: Unable to write to names.txt.");

        }

        input.close();
    }
}
