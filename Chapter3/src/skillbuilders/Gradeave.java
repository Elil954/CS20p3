package skillbuilders;

public class Gradeave {

	public static void main(String[] args) 
	{
		
		        // 3x3 board initialized with spaces
		        char[][] board = {
		            { ' ', ' ', ' ' },
		            { ' ', 'X', ' ' },
		            { ' ', ' ', ' ' }
		        };

		        // Print the board
		        for (int i = 0; i < 3; i++) {
		            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
		            if (i < 2) {
		                System.out.println("---+---+---");
		            }
		        }
		    
		

	}

}
