//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 5.8

/*
 * FibAndArmstrong.java
 * 
 * This program prints the first 20 Fibonacci numbers and all Armstrong numbers between 100 and 999.
 */

public class FibAndArmstrong {
    public static void main(String[] args) {
        // --- First 20 Fibonacci numbers ---
        System.out.println("First 20 Fibonacci numbers:");
        long a = 0, b = 1;
        for (int i = 1; i <= 20; i++) {
            System.out.print(a + (i < 20 ? " " : "\n"));
            long next = a + b;
            a = b;
            b = next;
        }
        // F(1)..F(20) = 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181

        // --- Armstrong numbers 100..999 ---
        System.out.println("\nArmstrong numbers between 100 and 999:");
        for (int n = 100; n <= 999; n++) {
            int hundreds = n / 100;
            int tens     = (n / 10) % 10;
            int ones     = n % 10;

            int sumCubes = hundreds * hundreds * hundreds
                         + tens     * tens     * tens
                         + ones     * ones     * ones;

            if (sumCubes == n) {
                System.out.println(n + " = " + hundreds + "^3 + "
                        + tens + "^3 + " + ones + "^3");
            }
        }
    }
}
