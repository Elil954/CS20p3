package mastery;

import java.util.Scanner;

public class IsoTriangle {

	
		/**
	     * Prints a specified number of spaces.
	     * @param count The number of spaces to print.
	     */
	    public static void addSpaces(int count) {
	        for (int i = 0; i < count; i++) {
	            System.out.print(" ");
	        }
	    }

	    /**
	     * Prints a bar of '*' characters. (Assuming 'drawBar()' prints a line of stars)
	     * @param count The number of stars to print.
	     */
	    public static void drawBar(int count) {
	        for (int i = 0; i < count; i++) {
	            System.out.print("*");
	        }
	    }

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        // 1. Get User Input
	        System.out.print("Enter the size: ");
	        int size = input.nextInt(); // This is the number of lines (height)

	        System.out.println(); // Print a blank line for formatting

	        // 2. Loop to draw each line of the triangle
	        for (int line = 1; line <= size; line++) {
	            
	            // Calculate the number of stars for the current line: 
	            // 1, 3, 5, 7, ... (2 * line - 1)
	            int numStars = 2 * line - 1;


	            int numSpaces = ( (2 * size - 1) - numStars) / 2;
	            
	            // 3. Print the leading spaces
	            addSpaces(numSpaces);

	            // 4. Print the stars
	            drawBar(numStars);

	            // 5. Move to the next line
	            System.out.println();
	        }

	        input.close();
	    }
	
	}
/*
Enter the size: 3

*
***
*****
*/

