//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 4.5

/*
 * This program prompts the user to enter three side lengths and determines if they can form a triangle.
 * If they can, it further classifies the triangle as equilateral, isosceles, or scalene based on the side lengths.
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three side lengths: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        in.close();

        // Triangle inequality: each side < sum of the other two
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Equilateral triangle");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }
        } else {
            System.out.println("Not a triangle");
        }
    }
}
