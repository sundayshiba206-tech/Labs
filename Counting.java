//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 5.1

/*
 * Counting.java
 * 
 * This program counts from 1 to 20, then counts down the even numbers from 20 to 2.
 */

public class Counting {
    public static void main(String[] args) {
        System.out.println("1 to 20:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();   // end the line

        System.out.println("\nEven numbers 20 down to 2:");
        for (int i = 20; i >= 2; i -= 2) {   // step -2
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
