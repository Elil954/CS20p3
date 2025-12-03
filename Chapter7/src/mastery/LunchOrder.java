

/*

Program: lunch.java        Last Date of this Revision: December 2, 2025

Purpose: Create a LunchOrder application that prompts the user for the number of hamburgers, salads, french
fries, and sodas and then displays the total for the order. The LunchOrder application should include
a Food object with a constructor that accepts the price, fat, carbs, and fiber for an item. Food methods
should return the price of the item and return the fat, carbohydrates, and fiber.

Author: The student
School: CHHS
Course: Computer Science 20
 

*/


package mastery;

import java.util.Scanner;

public class LunchOrder {
    
    // Food objects with prices from the chart
    private static final Food HAMBURGER = new Food(1.85, 9.0, 33.0, 1.0);
    private static final Food SALAD = new Food(2.00, 1.0, 11.0, 5.0);
    private static final Food FRENCH_FRIES = new Food(1.30, 11.0, 36.0, 4.0);
    private static final Food SODA = new Food(0.95, 0.0, 38.0, 0.0);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // **This variable stores and accumulates the total price of all items.**
        double totalCost = 0.0; 

        // 1. Hamburgers
        System.out.print("Enter number of hamburgers: ");
        int numHamburgers = input.nextInt();
        totalCost += calculateAndDisplay(numHamburgers, HAMBURGER, "Each hamburger"); // Accumulation

        // 2. Salads
        System.out.print("Enter number of salads: ");
        int numSalads = input.nextInt();
        totalCost += calculateAndDisplay(numSalads, SALAD, "Each salad"); // Accumulation

        // 3. French Fries
        System.out.print("Enter number of fries: ");
        int numFries = input.nextInt();
        totalCost += calculateAndDisplay(numFries, FRENCH_FRIES, "French fries"); // Accumulation

        // 4. Sodas
        System.out.print("Enter number of sodas: ");
        int numSodas = input.nextInt();
        totalCost += calculateAndDisplay(numSodas, SODA, "Each soda"); // Accumulation
        
        // Final Output
        System.out.printf("\nYour order comes to: $%.2f\n", totalCost); // Displays the final accumulated total
        input.close();
    }
    
 
    public static double calculateAndDisplay(int quantity, Food item, String label) {
        if (quantity > 0) {
            // Note: Nutrition display is required by the prompt, but the key is the return value.
            double totalFat = quantity * item.getFat();
            double totalCarbs = quantity * item.getCarbs();
            double totalFiber = quantity * item.getFiber();
            
            System.out.printf("%s has %.1fg of fat, %.1fg of carbs, and %.1fg of fiber.\n", 
                              label, totalFat, totalCarbs, totalFiber);
            
            return quantity * item.getPrice(); 
        }
        return 0.0;
    }
}






