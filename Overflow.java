//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 2.5

/**
 * A simple class to demonstrate integer overflow in Java.
 */

public class Overflow {
    public static void main(String[] args) {
        System.out.println("int  max:     " + Integer.MAX_VALUE);
        System.out.println("int  max + 1: " + (Integer.MAX_VALUE + 1));

        System.out.println("long max:     " + Long.MAX_VALUE);
        System.out.println("long value:   " + ((long) Integer.MAX_VALUE + 1));

        // Optional: detect overflow instead of silently wrapping
        try {
            int bad = Math.addExact(Integer.MAX_VALUE, 1);
            System.out.println(bad);
        } catch (ArithmeticException e) {
            System.out.println("Overflow caught: " + e.getMessage());
        }
    }
}
