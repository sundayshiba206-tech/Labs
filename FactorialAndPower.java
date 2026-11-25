//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 5.3

/*
 * FactorialAndPower.java
 * 
 * This program calculates the factorial of a number and 2 raised to that number.
 */


import java.util.Scanner;

public class FactorialAndPower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        in.close();

        if (n < 0) {
            System.out.println("n must be >= 0");
            return;
        }

        // --- Factorial: use long, int overflows at 13! ---
        long factorial = 1;
        for (int i = 2; i <= n; i++) {   // start at 2 — multiplying by 1 is wasted
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);

        // --- 2^n via loop, no Math.pow ---
        long power = 1;
        for (int i = 0; i < n; i++) {    // n multiplications
            power *= 2;
        }
        System.out.println("2^" + n + " = " + power);
    }
}
