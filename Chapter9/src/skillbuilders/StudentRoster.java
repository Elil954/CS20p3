package skillbuilders;

import java.util.Scanner;

public class StudentRoster {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        // Prompt user for the number of students
        System.out.print("Enter the number of students in the class: ");
        int numStudents = input.nextInt();
        input.nextLine(); // Consume newline

        // Declare an array to store the names
        String[] studentNames = new String[numStudents];

        // Prompt the user for each student's name and store it in the array
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();
        }

        // Display the title
        System.out.println("\n--- Student Roster ---");

        // List the names in the array
        for (String name : studentNames) {
            System.out.println(name);
        }

	
	}

}
