//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 4.7

/*
 * This program prompts the user to enter a year and a month, then calculates and displays the number of days in that month.
 * It accounts for leap years when determining the number of days in February.
 */


import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year:  ");
        int year = in.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = in.nextInt();
        in.close();

        if (month < 1 || month > 12) {
            System.out.println("Error: month must be between 1 and 12");
            return;
        }

        // Leap year: divisible by 4, NOT divisible by 100,
        // UNLESS also divisible by 400.
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int days;
        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:      // the 31-day months
                days = 31;
                break;
            case 4: case 6: case 9: case 11:   // the 30-day months
                days = 30;
                break;
            case 2:                            // February — the special one
                days = isLeap ? 29 : 28;
                break;
            default:                           // unreachable, but the compiler likes it
                days = 0;
        }

        System.out.println(year + "-" + month + " has " + days + " days");
    }
}
