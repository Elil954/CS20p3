/*

Program: House.java          Last Date of this Revision: November 6, 2025

Purpose: Create a House application that calls methods addRoof(), addBase(), and addWalk() to display the
following:

Author: The student
School: CHHS
Course: Computer Science 20
 

*/









package mastery;

public class House {
	// Method to display the roof of the house
    public static void addRoof() {
    	System.out.println("         ");
        System.out.println("        /\\");
        System.out.println("       /  \\");
        System.out.println("      /----\\");
    }

    // Method to display the base of the house (the square part)
    public static void addBase() {
        System.out.println("      |    |");
        System.out.println("      |    |");
        System.out.println("      |----|");
    }

    // Method to display the walkway and the two stars
    public static void addWalk() {
        System.out.println(" ****************");
        System.out.println(" *****      *****");
        System.out.println(" ****        ****");
        System.out.println(" ***          ***");
        System.out.println(" **            **");
        System.out.println(" **            **");
      
    }

    public static void main(String[] args) {
        
        // Call the methods in the correct order to draw the house
        System.out.println("--- Drawing a House ---");
        
        // 1. Draw the roof
        addRoof(); 
        
        // 2. Draw the base (body)
        addBase(); 
        
        // 3. Draw the walkway and stars
        addWalk(); 
    }
}
/*
--- Drawing a House ---

/\
/  \
/----\
|    |
|    |
|----|
****************
*****      *****
****        ****
***          ***
**            **
**            **
*/






