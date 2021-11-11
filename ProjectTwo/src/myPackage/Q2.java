package myPackage;

/*
 * Q2: Write a program to display the first 25 Fibonacci numbers beginning at 0
 */

public class Q2 {

	public void FibonacciSequence(int n) {
		// Fibonacci => 0,1,1,2,3,5,8,13,21,34, ...
		// n = (n-1) + (n-2)
		
		// set the first and second number to skip the zero edge case
		int num1 = 0, num2 = 1; 
		int counter = 0;  // (number of iterations based on given integer)
		
		// iterate until we reach the given "n"
		while (counter < n) {
			// print out the fibonacci number at the iteration with a space separating each number
			System.out.print(num1 + " ");
			

			// swap placement of num1 with num2 and create a new num3 for the next number
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;

			// increment the counter to reach towards the n value
			counter = counter + 1;
			
		}
	}
	
	// solution that considers the zero edge case 
	public static int FibAtZero(int n) {
		// the base case returns n instead, if the answer is less than or equal to one 
		// this takes care of n = 0, and n = 1 problem with the fibonacci sequence
		if (n <= 1)
			return n;
		
		// perform recursive call to get access to (n-1 and n-2)
		return FibAtZero(n - 1) + FibAtZero(n-2);
	}
}
