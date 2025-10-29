package skillbuilders;

import java.util.Scanner;
import java.util.Random;

public class Randomnum {

	public static void main(String[] args) {
		
		
		// 1. Create Scanner and Random objects
        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();

        // 2. Prompt and read the minimum value
        System.out.print("Enter the minimum value: ");
        int min = input.nextInt();

        // 3. Prompt and read the maximum value
        System.out.print("Enter the maximum value: ");
        int max = input.nextInt();
        
        // Basic check to ensure min is not greater than max
        if (min > max) {
            System.out.println("Error: The minimum value cannot be greater than the maximum value.");
            input.close();
            return; // Exit the program
        }

        // 4. Generate the random number (inclusive of min and max)
        // Formula: randomizer.nextInt(range) + min_value
        // Range = max - min + 1
        int range = max - min + 1;
        int randomNumber = randomizer.nextInt(range) + min;

        // 5. Display the result
        System.out.println("------------------------------------");
        System.out.println("Your range: [" + min + ", " + max + "]");
        System.out.println("The random integer is: " + randomNumber);
        System.out.println("------------------------------------");

        // 6. Close the scanner
        input.close();
		
		
		
		
		
		
		
	

	}

}
