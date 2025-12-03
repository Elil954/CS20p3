/*

Program: MysavingClient.java       Last Date of this Revision: December 2, 2025

Purpose:Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and
quarters into a piggy bank and then prompts the user to make a selection. The MySavings application
should include a PiggyBank object that can add coins to the piggy bank, remove coins, and return the
total amount in the bank.
Author: The student
School: CHHS
Course: Computer Science 20
 

*/







package mastery;

import java.util.Scanner;

// MySavings.java (Client application with menu)
public class MySavingsClientClass 
{

    public static void main(String[] args)
{
        Scanner input = new Scanner(System.in);
        PiggyBank bank = new PiggyBank();
        int choice;

        do
        {
            // Display Menu
            System.out.println("\n-------------------------------------");
            System.out.println("1. Show total in bank.");
            System.out.println("2. Add a penny (0.01).");
            System.out.println("3. Add a nickel (0.05).");
            System.out.println("4. Add a dime (0.10).");
            System.out.println("5. Add a quarter (0.25).");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter 0 to quit.");
            System.out.print("Enter your choice: ");
            
            if (input.hasNextInt())
            {
                choice = input.nextInt();
                input.nextLine(); // Consume newline
                
                switch (choice)
{
                    case 1:
                        System.out.printf("Total in bank: $%.2f\n", bank.getTotal());
                        break;
                    case 2:
                        bank.addCoin(0.01);
                        System.out.println("Penny added.");
                        break;
                    case 3:
                        bank.addCoin(0.05);
                        System.out.println("Nickel added.");
                        break;
                    case 4:
                        bank.addCoin(0.10);
                        System.out.println("Dime added.");
                        break;
                    case 5:
                        bank.addCoin(0.25);
                        System.out.println("Quarter added.");
                        break;
                    case 6:
                        System.out.print("Enter amount to remove: ");
                        double amount = input.nextDouble();
                        if (bank.removeCoins(amount)) 
                        {
                            System.out.printf("$%.2f removed. Current total: $%.2f\n", amount, bank.getTotal());
                        } else
                        {
                            System.out.println("Error: Insufficient funds.");
                        }
                        break;
                    case 0:
                        break; // Exit case
                    default:
                        System.out.println("Invalid choice. Please enter 0-6.");
                        }
            } else 
            {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // Consume invalid token
                choice = -1; // Keep loop running
            }
            
        } while (choice != 0);

        System.out.println("Application closed. Final balance: " + bank.getTotal());
        
    }
}








