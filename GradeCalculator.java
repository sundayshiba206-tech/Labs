//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 4.2

/*
 * This program prompts the user to enter a score and calculates the corresponding grade based on predefined thresholds.
 * The program validates the input score to ensure it is between 0 and 100 before determining the grade.
 */


import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter score (0-100): ");
        int score = in.nextInt();
        in.close();

        // --- VALIDATION FIRST — reject before grading ---
        if (score < 0 || score > 100) {
            System.out.println("Error: score must be between 0 and 100 (got " + score + ")");
            return;                       // stop here — do not grade an invalid score
        }

        // --- Ladder: highest threshold first (your order is correct) ---
        char grade;
        if      (score >= 70) grade = 'A';
        else if (score >= 60) grade = 'B';
        else if (score >= 50) grade = 'C';
        else if (score >= 45) grade = 'D';
        else if (score >= 40) grade = 'E';
        else                  grade = 'F';   // 0–39 — now genuinely only valid scores

        System.out.println("Score " + score + " -> Grade " + grade);
    }
}
