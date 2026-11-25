//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 4.6

/*
 * This program prompts the user to enter a username and password, then checks if the entered credentials match the stored ones.
 * It uses the equals() method for string comparison to ensure accurate validation of the credentials.
 */


import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // Stored credentials
        String storedUser = "admin";
        String storedPass = "s3cret";

        Scanner in = new Scanner(System.in);
        System.out.print("Username: ");
        String user = in.nextLine();
        System.out.print("Password: ");
        String pass = in.nextLine();
        in.close();

        // equals(), NOT ==
        if (storedUser.equals(user) && storedPass.equals(pass)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}
