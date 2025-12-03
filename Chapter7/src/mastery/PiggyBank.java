
/*

Program: PiggyBank.java        Last Date of this Revision: December 2, 2025

Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and
quarters into a piggy bank and then prompts the user to make a selection. The MySavings application
should include a PiggyBank object that can add coins to the piggy bank, remove coins, and return the
total amount in the bank.

Author: The student
School: CHHS
Course: Computer Science 20
 

*/


package mastery;

public class PiggyBank {
    
    private double totalAmount; // Stores the total amount in dollars

    // Constructor to initialize the bank
    public PiggyBank() {
        totalAmount = 0.0;
    }

    /** Returns the current total amount in the bank. */
    public double getTotal() {
        return totalAmount;
    }

    /** Adds a specified coin value (in dollars) to the bank. */
    public void addCoin(double value) {
        totalAmount += value;
    }

    /** Removes a specified amount from the bank, if possible. */
    public boolean removeCoins(double amount) {
        if (amount > totalAmount) {
            return false; // Not enough money
        }
        totalAmount -= amount;
        return true;
    }
}

/*
-------------------------------------
1. Show total in bank.
2. Add a penny (0.01).
3. Add a nickel (0.05).
4. Add a dime (0.10).
5. Add a quarter (0.25).
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 2
Penny added.

-------------------------------------
1. Show total in bank.
2. Add a penny (0.01).
3. Add a nickel (0.05).
4. Add a dime (0.10).
5. Add a quarter (0.25).
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 0
Application closed. Final balance: 0.01
*/