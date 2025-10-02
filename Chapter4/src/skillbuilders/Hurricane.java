package skillbuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		String speedRange;
		
		System.out.print("Enter the Saffir-Simpson Hurricane Category (1-5): ");
		
		int category = input.nextInt();
		
		
		switch (category) {
        case 1:
            speedRange = "Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr";
            break;
        case 2:
            speedRange = "Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr";
            break;
        case 3:
            speedRange = "Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr";
            break;
        case 4:
            speedRange = "Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr";
            break;
        case 5:
            // Note the "greater than" for Category 5
            speedRange = "Category 5: greater than 155 mph or 135 kt or 249 km/hr";
            break;
        default:
            // Handle invalid input
            speedRange = "Invalid Category. Please enter a number between 1 and 5.";
            break;
    }

		System.out.println("\n--- Hurricane Wind Speed ---");
        System.out.println(speedRange);
        System.out.println("----------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
