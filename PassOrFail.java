//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 4.1

/*
 * This program prompts the user to enter a score and checks if the score is a pass or fail.
 * A score of 40 or above is considered a pass, while a score below 40 is considered a fail.
 */

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        final int PASS_MARK = 40;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = in.nextInt();
        in.close();

        if (score >= PASS_MARK) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
