package skillbuilders;

import java.util.Scanner;

public class RectanglePerimeter 
{
    public static void main(String[] args) 
    {
    	
    	Scanner userInput = new Scanner(System.in);
    	
    	System.out.print("Please enter a length value: ");
    	int length = userInput.nextInt(); 

        //int perimeter = 2 * width + 2 * length;
        
     // Create a Scanner object to read input from the console
    	System.out.print("Please enter a width value: ");
		int width = userInput.nextInt();
        
        int area = length * width;

        System.out.println("The area of the rectangle is: " + area);
    }
    
    
    
  

    
    
    

}





