package myPackage;

import java.util.Arrays;

/*
 * Question 9: . Create an ArrayList which stores numbers from 1 to 100 and prints out all the prime numbers 
 * to the console.
 */

public class QNine {
	// create an ArrayList that stores numbers 1-100
	int[] numArray = new int[100];
	
	public void numbers() {
		Arrays.setAll(numArray, i -> i + 1);
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}
	}
	
	// print out the numbers in the array
	public void primeNumbers() {
		System.out.println("\nPrime numbers in array:");
		for (int i = 2; i <= 100; i++) {
			// check if prime number and print if true
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	
	
// check if number is a prime number
public boolean isPrime(int num) {
	if (num == 2 || num == 3) {
		return true;
	}
	if (num % 2 == 0 || num % 3 == 0) {
		return false;
	}
	
	for (int i = 3; i < Math.sqrt(num); i += 2) {
		if (num % i == 0 || num % Math.sqrt(num) == 0) {
			return false;
		}
	}
	return true;
}
}
