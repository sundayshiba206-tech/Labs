//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 6.3

/*
 * A simple class to represent a rectangle, with validation.
 */

public class ValidatedRectangle {
    private double length;
    private double width;

    public ValidatedRectangle(double length, double width) {
        setLength(length);   // route through the setters so validation is shared
        setWidth(width);
    }

    public double getLength() { return length; }
    public double getWidth()  { return width;  }

    public void setLength(double length) {
        if (length < 0) {
            System.out.println("Rejected: length cannot be negative (" + length + ")");
            return;   // leave the field unchanged
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (width < 0) {
            System.out.println("Rejected: width cannot be negative (" + width + ")");
            return;
        }
        this.width = width;
    }

    public double area()      { return length * width; }
    public double perimeter() { return 2 * (length + width); }

    public static void main(String[] args) {
        ValidatedRectangle r = new ValidatedRectangle(5, 3);
        System.out.println("Start:  " + r.getLength() + " x " + r.getWidth());

        r.setLength(8);          // valid — accepted
        System.out.println("Valid:   " + r.getLength() + " x " + r.getWidth());

        r.setWidth(-4);          // invalid — rejected, field unchanged
        System.out.println("After:   " + r.getLength() + " x " + r.getWidth());

        ValidatedRectangle bad = new ValidatedRectangle(-2, 5);   // constructor path
        System.out.println("From constructor: " + bad.getLength() + " x " + bad.getWidth());
    }
}
