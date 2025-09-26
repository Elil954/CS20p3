package mastery;

import java.util.Scanner;

public class PizzaCost {

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        // Prompt the user for the pizza's diameter
        System.out.print("Enter the diameter of the pizza in inches: ");

        // Read the diameter as a double
        double diameter = input.nextDouble();

        // Define the fixed and variable costs
        double laborCost = 0.75;
        double rentCost = 1.00;
        double materialsCost = 0.05 * Math.pow(diameter, 2);

        // Calculate the total cost
        double totalCost = laborCost + rentCost + materialsCost;

        // Print the result to the console, formatted as currency (two decimal places)
        System.out.printf("The cost of making the pizza is: $%.2f\n", totalCost);

        
        
    }
}