//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 2.2

/**
 * A simple class to represent a circle and calculate its area and circumference.
 */

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);   // π * r^2
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;            // 2πr
    }

    public static void main(String[] args) {
        Circle c = new Circle(7.5);

        System.out.println("Radius:        " + c.getRadius());
        System.out.println("Area:          " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());

        // Optional: neatly formatted to 2 decimal places
        System.out.printf("%nRadius:        %.2f%n", c.getRadius());
        System.out.printf("Area:          %.2f%n", c.getArea());
        System.out.printf("Circumference: %.2f%n", c.getCircumference());
    }
}
