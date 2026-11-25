//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 6.1

/*
 * A simple class to represent a rectangle.
 */

public class Rectangle {
    private double length;   // private = encapsulation
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;      // 'this.' disambiguates the field
        this.width  = width;       //  from the parameter of the same name
    }

    public double getLength() { return length; }
    public double getWidth()  { return width;  }

    public double area()      { return length * width; }
    public double perimeter() { return 2 * (length + width); }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 3.0);
        Rectangle r2 = new Rectangle(10.0, 2.5);

        System.out.println("r1: " + r1.getLength() + " x " + r1.getWidth()
                + "  area=" + r1.area() + "  perimeter=" + r1.perimeter());
        System.out.println("r2: " + r2.getLength() + " x " + r2.getWidth()
                + "  area=" + r2.area() + "  perimeter=" + r2.perimeter());
    }
}
