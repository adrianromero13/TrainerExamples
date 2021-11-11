package myPackage;

/*
 *  Display the triangle on the console as follows using any type of loop. Do NOT use a simple 
 *  group of print statements to accomplish this. 
 *  0 
 *  1 0
 *  1 0 1
 *  0 1 0 1
 */

public class Q13 {
	
	// establish dimensions columns 4, rows 1 -> 2 -> 3 -> 4
	// first loop will add rows, second loop will add columns to each row
	
	public static void PrintTriangle(int size) {
		int currentChar = 0;
		
	// iterate through each row
	for (int i = 0; i < size; ++i) {
		
		// add the right number of characters
		for (int j = 0; j < i + 1; ++j) {
			System.out.print( (currentChar %2) + " ");
			++ currentChar;
		}
		System.out.println();
	}
	}

}
