package skillbuilders;

import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int maxNum;
        int sum = 0; // Initialize sum to zero

        // 2. Prompt and read the maximum number
        System.out.print("Enter a positive integer: ");
        maxNum = input.nextInt();
        
        System.out.println("-------------------------");
        System.out.println("Sequence of numbers:");

        // 3. Loop, display numbers, and calculate sum
        // The loop runs from 1 up to and including maxNum
        for (int i = 1; i <= maxNum; i++) {
            
            // Display the current number on a separate line
            System.out.println(i); 
            
            // Add the current number to the running total
            sum += i; 
        }

        // 4. Display the final sum
        System.out.println("-------------------------");
        System.out.println("The sum is: " + sum);
        System.out.println("-------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
