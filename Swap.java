//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 2.6

/**
 * A simple class to demonstrate swapping two integers in Java.
 */

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;

        System.out.println("Before: a = " + a + ", b = " + b);

        int temp = a;   // save a
        a = b;          // a ← b
        b = temp;       // b ← old a

        System.out.println("After:  a = " + a + ", b = " + b);
    }
}
