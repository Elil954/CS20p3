package mastery;

public class Investment {

	public static void main(String[] args) {
		
		
		final double INITIAL_INVESTMENT = 2500.00;
        final double TARGET_VALUE = 5000.00;
        final double INTEREST_RATE = 0.075; // 7.5%
        
        // Variables that will change during the calculation
        double currentBalance = INITIAL_INVESTMENT;
        int years = 0;

        System.out.println("Investment Simulation Started");
        System.out.printf("Starting Investment: $%.2f\n", INITIAL_INVESTMENT);
        System.out.printf("Target Value: $%.2f\n", TARGET_VALUE);
        System.out.printf("Annual Interest Rate: %.1f%%\n", INTEREST_RATE * 100);
        System.out.println("----------------------------------------");
        
        System.out.println("");
        
        // This prints a blank line (a newline character)
        System.out.println();
        
        // --- 2. While Loop to Simulate Compounding ---
        // Continue compounding as long as the current balance is below the target
        while (currentBalance < TARGET_VALUE) {
            
            // Increment the year count
            years++;
            
            // Calculate the new balance after one year (Compounded Annually)
            currentBalance = currentBalance * (1 + INTEREST_RATE);
            
            // Optional: Print progress for demonstration
            // System.out.printf("Year %d: $%.2f\n", years, currentBalance); 
        }

        // --- 3. Display Final Result ---
        System.out.println("\n*** Result ***");
        System.out.println("The investment reached the target in " + years + " years.");
        System.out.printf("Final Balance: $%.2f\n", currentBalance);
        System.out.println("----------------------------------------");
		
		
		
		
		
		
		
		
	
		

	}

}
