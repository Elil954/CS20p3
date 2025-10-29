package mastery;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		// Define the pricing tiers as constants
        final double PRICE_TIER_1 = 0.50; // < 4 dozen
        final double PRICE_TIER_2 = 0.45; // 4 up to < 6 dozen
        final double PRICE_TIER_3 = 0.40; // 6 up to < 11 dozen
        final double PRICE_TIER_4 = 0.35; // 11 or more dozen
        
        double pricePerDozen = 0.0;
        double totalCost = 0.0;
        
        // --- 2. Get User Input ---
        System.out.print("Enter the total number of eggs purchased: ");
        int totalEggs = input.nextInt();

        // --- 3. Calculate Dozens and Extras ---
        // 1 dozen = 12 eggs
        int fullDozens = totalEggs / 12;
        int extraEggs = totalEggs % 12;

        // --- 4. Determine Price per Dozen (using fullDozens) ---
        if (fullDozens < 4) {
            pricePerDozen = PRICE_TIER_1;
        } else if (fullDozens < 6) {
            pricePerDozen = PRICE_TIER_2;
        } else if (fullDozens < 11) {
            pricePerDozen = PRICE_TIER_3;
        } else { // 11 or more dozen
            pricePerDozen = PRICE_TIER_4;
        }

        // --- 5. Calculate Total Cost ---
        
        // a) Cost of the full dozens
        double dozensCost = fullDozens * pricePerDozen;
        
        // b) Cost of the extra eggs (1/12 the per dozen price)
        double pricePerEgg = pricePerDozen / 12.0; 
        double extraEggsCost = extraEggs * pricePerEgg;

        // c) Total cost
        totalCost = dozensCost + extraEggsCost;

        // --- 6. Display Output ---
        System.out.println("\n-------------------------------------------");
        System.out.println("Total Eggs Purchased: " + totalEggs);
        System.out.println("Full Dozens: " + fullDozens);
        System.out.println("Extra Eggs: " + extraEggs);
        System.out.printf("Price Tier Applied: $%.2f per dozen\n", pricePerDozen);
        System.out.printf("Total Cost: $%.2f\n", totalCost);
        System.out.println("-------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		

	}

}
