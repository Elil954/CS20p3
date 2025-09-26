package skillbuilders;


import java.util.Scanner;

    public class PizzaCost {

    	public static void main(String[] args) 
    	{
    		//Get digits from user
    	    System.out.print("Enter two digit numbers: ");
    	    
    	 try (// Create a Scanner object to read input from the console
    		Scanner input = new Scanner(System.in)) {
    			int number = input.nextInt();
    			
    			int tens, ones;
    			
    			tens = number / 10;
    			ones = number % 10;
    			
    			System.out.println("Tens = "+ tens);
    		}
    	    
    	    String Ones = null;
    		System.out.print("Ones = "+ Ones);

    	}

    }




	
