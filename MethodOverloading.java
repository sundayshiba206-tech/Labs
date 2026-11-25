//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 7.3

/*
 * This class demonstrates method overloading by providing multiple methods to calculate the area of different shapes.
 * It includes methods to calculate the area of a square, rectangle, and circle.
 */

public class MethodOverloading {

    // Calculate the area of a square
    public static double area(double side) {
        return side * side;
    }

    // Calculate the area of a rectangle
    public static double area(double length, double width) {
        return length * width;
    }

    // Calculate the area of a circle
    public static double area(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        // Call square area method
        System.out.println("Area of square: " + area(5.0));

        // Call rectangle area method
        System.out.println("Area of rectangle: " + area(5.0, 8.0));

        // Call circle area method
        System.out.printf("Area of circle: %.2f%n", area(5));
    }
}
