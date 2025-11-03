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
