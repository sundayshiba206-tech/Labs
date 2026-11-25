//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 4.4

/*
 * This program prompts the user to enter two numbers and an operator, then performs the corresponding arithmetic operation.
 * It handles addition, subtraction, multiplication, and division, including error handling for division by zero and unknown operators.
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number:  ");
        double a = in.nextDouble();
        System.out.print("Enter second number: ");
        double b = in.nextDouble();
        System.out.print("Enter operator (+ - * /): ");
        String op = in.next();   // read as String → switch on String
        in.close();

        double result;
        switch (op) {
            case "+":
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;
            case "-":
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;
            case "*":
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Error: division by zero");
                } else {
                    result = a / b;
                    System.out.println(a + " / " + b + " = " + result);
                }
                break;
            default:
                System.out.println("Error: unknown operator '" + op + "'");
        }
    }
}
