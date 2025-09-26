package mastery;

import java.util.Scanner;

public class ObjectHeight {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the time
        System.out.print("Enter a time less than 4.5 seconds: ");

        // Read the time as a double
        double time = input.nextDouble();

        // Calculate the height using the given formula
        // Math.pow(time, 2) calculates time squared
        double height = 100 - 4.9 * Math.pow(time, 2);

        
        System.out.printf("The height of the object is: %.1f meters\n", height);

        
        
    }
}

	


