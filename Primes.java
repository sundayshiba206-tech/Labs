//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 5.6

/*
 * Primes.java
 * 
 * This program prints all prime numbers between 1 and 100.
 */

public class Primes {
    public static void main(String[] args) {
        System.out.println("Primes between 1 and 100:");

        int count = 0;
        for (int n = 2; n <= 100; n++) {          // 1 is not prime — start at 2
            if (isPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
        }
        System.out.println("\n(" + count + " primes)");
    }

    // Trial division up to sqrt(n) — anything larger has a paired factor
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int d = 2; d * d <= n; d++) {        // d*d <= n avoids Math.sqrt
            if (n % d == 0) return false;
        }
        return true;
    }
}
