package skillbuilders;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) 
	{
		
		int numVisitors = 0;
		int totalVistors = 0;
		int avgVisitors = 0;
		
		
		Scanner userInput = new Scanner(System.in);
		
	
		
		for(int day = 1; day <=5; day++)
		{
			System.out.println(
					"Enter the number"
					+ "of visitors on day"
					+ day + " : "
				            );
			numVisitors = userInput.nextInt();
			totalVistors = totalVistors + numVisitors;
			
		}
		
		avgVisitors = (totalVistors / 5);
		System.out.println("The average number of"
				            +" visitors is : "
				            + avgVisitors );
				            	
				       
		
		}

	}


