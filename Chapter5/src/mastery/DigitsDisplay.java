/*

Program: DigitsDiaplay.java          Last Date of this Revision: November 3, 2025

Purpose: Create a DigitsDisplay application that prompts the user for a non-negative integer and then displays
each digit on a separate line. Application output should look similar to

Author: The student
School: CHHS
Course: Computer Science 20
 

*/





package mastery;

import java.util.Scanner;

public class DigitsDisplay {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);

       
        System.out.print("Enter a non-negative integer: ");
      
        String numberString = input.next(); 

        System.out.println("--------------------------------");
   
        for (int i = 0; i < numberString.length(); i++) {
            
            // Get the character (digit) at the current index
            char digitChar = numberString.charAt(i);
            
            // Display the character (digit) on a separate line
            System.out.println(digitChar);
        }
        
        System.out.println("--------------------------------");
		
		
		
		
		

	}

}

/*Screen Dump
Enter a non-negative integer: 8
--------------------------------
8
--------------------------------

*/







