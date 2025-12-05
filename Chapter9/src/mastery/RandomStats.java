package mastery;

import java.util.Random;

public class RandomStats {

    public static void main(String[] args) {
        Random rand = new Random();
        
        // Array of size 10 to hold counts for numbers 0 through 9
        // Index 0 stores the count for number 0, Index 1 for number 1, etc.
        int[] counts = new int[10];

        // 1. Generate 500 random numbers
        for (int i = 0; i < 500; i++) {
            // Generate a random number from 0 to 9 (inclusive)
            int randomNumber = rand.nextInt(10); 
            
            // Use the random number itself as the index to increment the count
            counts[randomNumber]++;
        }

        // 2. Display the results
        System.out.println("Number\tOccurrences");
        System.out.println("------\t-----------");

        // Loop through the counts array (from index 0 to 9)
        for (int i = 0; i < counts.length; i++) {
            // i represents the number (0-9)
            // counts[i] represents the number of times that number occurred
            System.out.println(i + "\t" + counts[i]);
            
            System.out.println("------\t-----------");

        }
    }
}
