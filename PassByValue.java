//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 7.4

/*
 * This class demonstrates the concept of pass-by-value in Java.
 * It includes a method to swap two numbers and shows that the original values remain unchanged after the method call.
 */

public class PassByValue {

    // Method that attempts to swap two numbers
    public static void swap(int a, int b) {

        int temp = a;

        a = b;

        b = temp;

        System.out.println("Inside swap method:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        int first = 10;
        int second = 20;

        System.out.println("Before calling swap:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);

        // Call the swap method
        swap(first, second);

        // Display original variables
        System.out.println("\nAfter calling swap:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);
    }
}
