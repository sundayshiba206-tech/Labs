//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 3.4

/*
 * This program prompts the user to enter three items and their prices, 
 * calculates the total, and displays a formatted bill.
 */

import java.util.Scanner;

public class BillFormatter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables for item names and prices
        String item1, item2, item3;
        double price1, price2, price3;

        // Get first item
        System.out.print("Enter first item: ");
        item1 = input.nextLine();

        System.out.print("Enter price: ");
        price1 = input.nextDouble();
        input.nextLine();

        // Get second item
        System.out.print("Enter second item: ");
        item2 = input.nextLine();

        System.out.print("Enter price: ");
        price2 = input.nextDouble();
        input.nextLine();

        // Get third item
        System.out.print("Enter third item: ");
        item3 = input.nextLine();

        System.out.print("Enter price: ");
        price3 = input.nextDouble();

        // Calculate total
        double total = price1 + price2 + price3;

        // Display the bill
        System.out.println("\n========== CUSTOMER BILL ==========");

        System.out.printf("%-20s %12s%n", "ITEM", "PRICE");
        System.out.println("-----------------------------------");

        System.out.printf("%-20s %12.2f%n", item1, price1);
        System.out.printf("%-20s %12.2f%n", item2, price2);
        System.out.printf("%-20s %12.2f%n", item3, price3);

        System.out.println("-----------------------------------");
        System.out.printf("%-20s %12.2f%n", "TOTAL", total);

        input.close();
    }
}
