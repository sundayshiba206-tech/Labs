//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 8.8

/*
 * This program collects marks for five students across four courses,
 * calculates each student's total and average marks, and computes the average marks for each course.
 */

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Five students and four courses
        int[][] marks = new int[5][4];

        // Read marks for every student in every course
        for (int student = 0; student < 5; student++) {
            System.out.println("\nEnter marks for Student " + (student + 1));

            for (int course = 0; course < 4; course++) {
                System.out.print("Course " + (course + 1) + ": ");
                marks[student][course] = input.nextInt();
            }
        }

        // Calculate each student's total and average
        System.out.println("\nSTUDENT RESULTS");

        for (int student = 0; student < 5; student++) {
            int total = 0;

            for (int course = 0; course < 4; course++) {
                total += marks[student][course];
            }

            double average = total / 4.0;

            System.out.println("Student " + (student + 1)
                    + " Total: " + total
                    + " Average: " + average);
        }

        // Calculate each course's average
        System.out.println("\nCOURSE AVERAGES");

        for (int course = 0; course < 4; course++) {
            int total = 0;

            for (int student = 0; student < 5; student++) {
                total += marks[student][course];
            }

            double average = total / 5.0;

            System.out.println("Course " + (course + 1)
                    + " Average: " + average);
        }

        input.close();
    }
}
