package skillbuilders;

import java.util.Scanner;

public class PizzaCost {

	public static void main(String[] args) 
	{

		 Scanner scanner = new Scanner(System.in);
		 
		 // Prompt user for pizza diameter
	        System.out.print("Enter the diameter of the pizza in inches: ");

	        double diameter = scanner.nextDouble();
	        double laborCost = 0.75;
	        double rentCost = 1.00;
	        double materialsCost = 0.05 * diameter * diameter;
	        
	        // Total cost
	        double totalCost = laborCost + rentCost + materialsCost;
	        
	     // Display the result
	        System.out.printf("The cost of making the pizza is: $%.2f%n ", totalCost);
	        
	        // Close the scanner
	        scanner.close();
	}

}
