//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 7.2

/*
 * This class contains methods to convert temperatures between Celsius and Fahrenheit.
 * It includes methods to convert Celsius to Fahrenheit and vice versa.
 */

public class TemperatureMethods {

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {

        // Print table headings
        System.out.println("CELSIUS       FAHRENHEIT");
        System.out.println("------------------------");

        // Print temperatures from 0 to 100
        for (int celsius = 0; celsius <= 100; celsius += 10) {

            double fahrenheit = celsiusToFahrenheit(celsius);

            System.out.printf("%-12d %10.1f%n", celsius, fahrenheit);
        }

        // Test Fahrenheit to Celsius
        System.out.println("\n212 Fahrenheit in Celsius: "
                + fahrenheitToCelsius(212));
    }
}
