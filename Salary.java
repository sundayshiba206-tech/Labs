//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 2.3

/**
 * A simple class to calculate salary after tax and deductions.
 */

public class Salary {
    // Constants are conventionally static final, ALL_CAPS
    static final double TAX_RATE = 0.15;   // 15%

    public static void main(String[] args) {
        double grossSalary = 85000.00;     // declare gross
        double deduction   = 5000.00;      // e.g. pension/NHIF

        double tax     = grossSalary * TAX_RATE;
        double netSalary = grossSalary - tax - deduction;

        System.out.println("Gross salary: " + String.format("%.2f", grossSalary));
        System.out.println("Tax (15%):    " + String.format("%.2f", tax));
        System.out.println("Deduction:    " + String.format("%.2f", deduction));
        System.out.println("Net salary:   " + String.format("%.2f", netSalary));
    }
}
