//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 5.2

/*
 * MarksStats.java
 * 
 * This program reads marks from the user until -1 is entered, then prints the count, sum, average, highest and lowest mark.
 */


import java.util.Scanner;

public class MarksStats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;
        int sum   = 0;
        int highest = Integer.MIN_VALUE;   // so any real mark beats it
        int lowest  = Integer.MAX_VALUE;   // so any real mark loses to it

        System.out.println("Enter marks (-1 to stop):");
        while (true) {
            int mark = in.nextInt();
            if (mark == -1) break;          // sentinel — stop, don't count it

            count++;
            sum += mark;
            if (mark > highest) highest = mark;
            if (mark < lowest)  lowest  = mark;
        }
        in.close();

        if (count == 0) {
            System.out.println("No marks entered.");
            return;
        }

        double average = (double) sum / count;   // cast or you get int division

        System.out.println("Count:   " + count);
        System.out.println("Sum:     " + sum);
        System.out.println("Average: " + String.format("%.2f", average));
        System.out.println("Highest: " + highest);
        System.out.println("Lowest:  " + lowest);
    }
}
