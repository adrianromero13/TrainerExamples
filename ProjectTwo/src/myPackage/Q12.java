package myPackage;

import java.util.Arrays;

/*
 * Question 12: Write a program to store numbers from 1 to 100 in an array. Print out all the even numbers 
 * from the array. Use the enhanced FOR loop for printing out the numbers.
 */

public class Q12 {
	// create an array with size = 100
	int[] numArray = new int[100];

	public void evenNumbers() {
		System.out.println("\nEven numbers from number array {1, ..., 100}");
		// sets array with numbers 1 - 100
		Arrays.setAll(numArray, i -> i + 1);

		// print even numbers (even numbers have no remainder when divided by 2 (use
		// enhanced for-loop)
		for (int num : numArray) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
	}

}
