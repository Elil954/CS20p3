package skillbuilders;

import java.util.Scanner;

public class Exponentiation {

    /**
     * Calculates and returns the first number raised to the power of the second number.
     * Uses Math.pow(base, exponent) for the calculation.
     * * @param base The number to be raised to a power (e.g., 2 in 2^3).
     * @param exponent The power (e.g., 3 in 2^3).
     * @return The result of base ^ exponent.
     */
    public static double powerOf(double base, double exponent) {
        // Math.pow is the standard Java method for exponentiation
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Exponentiation Calculator ---");

        // 1. Prompt and read the base number
        System.out.print("Enter the base number: ");
        double num1 = input.nextDouble();

        // 2. Prompt and read the exponent number
        System.out.print("Enter the exponent (power): ");
        double num2 = input.nextDouble();

        // 3. Call the powerOf method
        double result = powerOf(num1, num2);

        // 4. Display the result
        System.out.printf("\nResult: %.2f raised to the power of %.2f is: %.2f\n", 
                          num1, num2, result);
        System.out.println("-----------------------------------------------------------");

        input.close();
    }
}
/*
--- Exponentiation Calculator ---
Enter the base number: 2
Enter the exponent (power): 3

Result: 2.00 raised to the power of 3.00 is: 8.00
-----------------------------------------------------------

*/