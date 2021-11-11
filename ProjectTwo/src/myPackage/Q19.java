package myPackage;

import java.util.ArrayList;

/*
 * Question 19: Create an ArrayList and insert integers 1 through 10. Display the ArrayList. Add all the even 
 * numbers up and display the result. Add all the odd numbers up and display the result. Remove 
 * the prime numbers from the ArrayList and print out the remaining ArrayList.
 */

public class Q19 {

	// create arraylist with nums 1 t0 10
	ArrayList<Integer> numbers;

	public void Displays() {
		numbers = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}
		// display the arraylist with nums 1-10
		printArrayList();

		// display the sum of all even numbers
		System.out.println("\nEven Total: " + addEvenNumbers());

		// display the sum of all odd numbers
		System.out.println("Odd Total: " + addOddNumbers());

		// display the remaining Arraylist after all primes were removed
		dropPrimes();
		printArrayList();
	}

	private void printArrayList() {

		System.out.print("\nThe ArrayLists's contnet: [");
		;
		for (Integer i : numbers) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}

	// method for sum of all even numbers
	private int addEvenNumbers() {
		int total = 0; // initial value
		for (Integer i : numbers) {
			if (i % 2 == 0)
				total += i;
		}
		return total;
	}

	// method for sum of all odd numbers
	private int addOddNumbers() {
		int total = 0;
		for (Integer i : numbers) {
			if (i % 2 != 0)
				total += i;
		}
		return total;
	}

	// method for checking if number is prime
//	public boolean isPrime(int num) {
//		if (num == 2 || num == 3) {
//			return true;
//		}
//		if (num % 2 == 0 || num % 3 == 0) {
//			return false;
//		}
//
//		for (int i = 3; i < Math.sqrt(num); i += 2) {
//			if (num % i == 0 || num % Math.sqrt(num) == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
	public boolean isPrime(int integer) {
		if (integer == 0 || integer == 1)
			return false;
		for (int i = 2; i < integer; ++i) {
			if (integer % i == 0)
				return false;
		}
		return true;
	}

	// method for removing the prime numbers from the arraylist
	private void dropPrimes() {
		for (int i = 0; i < numbers.size(); ++i) {
			if (isPrime(numbers.get(i))) {
				numbers.remove(i);
				// Subtract one to account for the removal of a prime
				--i;
			}
		}
	}

}
