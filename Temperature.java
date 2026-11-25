//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 2.1

/**
 * A simple class to represent a temperature in Celsius and convert it to other scales.
 */


public class Temperature {
    private double celsius;

    public Temperature(double celsius) { this.celsius = celsius; }

    public double getCelsius()   { return celsius; }
    public double toFahrenheit() { return (celsius * 9.0 / 5.0) + 32; }  // 9/5 → 1 in int math!
    public double toKelvin()     { return celsius + 273.15; }

    public static void main(String[] args) {
        Temperature t = new Temperature(25);
        System.out.println("Celsius:    " + t.getCelsius());
        System.out.println("Fahrenheit: " + t.toFahrenheit());
        System.out.println("Kelvin:     " + t.toKelvin());
    }
}
