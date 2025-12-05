package mastery;

import java.util.Random;

public class EvensAndOdds {

    public static void main(String[] args) {
        // Create a Random object for generating numbers
        Random rand = new Random();
        
        // Use StringBuilder for efficient string concatenation for output
        StringBuilder odds = new StringBuilder("ODD:\n");
        StringBuilder evens = new StringBuilder("EVEN:\n");

        // Loop 25 times to generate 25 random integers
        for (int i = 0; i < 25; i++) {
            // Generate a random integer between 0 and 99 (nextInt(100))
            int number = rand.nextInt(100); 

            // Check if the number is even or odd using the modulo operator (%)
            if (number % 2 == 0) {
                // Number is even
                evens.append(number).append(" ");
            } else {
                // Number is odd
                odds.append(number).append(" ");
            }
        }
        
        // Display the results, with evens on one line and odds on the other
        System.out.println(odds.toString());
        System.out.println(evens.toString());
    }
}
