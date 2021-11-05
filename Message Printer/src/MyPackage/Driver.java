package MyPackage;


public class Driver {

	public static void main(String[] args) {
		String myMessage = "Hello!";  // This is called a String Literal, named for the manually-entered value
		int runIterations = 6;
		
		for (int i = 0; i < runIterations; ++i) {
			System.out.println(myMessage + ": " + i);
			// will print [myMessage]: [i]
			
		}
		/*
		 * 1. Start i at 0
		 * 2. Check if i is less than the value stored in runIterations
		 * 3. If it is, run the code between the curly braces and increment (that is, add 1 to) the value held by i
		 * 4. Go to step 2
		 */
		
		int j = 0;
		while (j < runIterations)
		{
			System.out.println("J is still going! J = " + j);
			++j;
		}
		
//		boolean done = true;
//		while (!done) {
//			System.out.println("Still not done!");
//			// infinite loop...must stop manually since it never ends
//			// ! (bang operator) = means "not" which negates the value (the opposite)
//			// "while done is not false, run this loop."
//			
//			// adding this line to force the loop to stop at the 12th iteration
////			if (j % 12 == 0)
////				done = true;
//		}
		
		// While loops are useful for code that needs to run so long as something is true
		// For loops are useful for running for every item in a list or for a certain number of times
		
//		do {
//			
//		} while (true);
	}
}
