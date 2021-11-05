package Driver;

import myPackage.QOne;
import myPackage.QTwo;
import myPackage.QThree;
import myPackage.QFour;
import myPackage.QFive;

public class Driver {

	
	public static void main(String[] args) {
		
		QOne q1 = new QOne();
		
		// bubble sort variable
		int arr[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		q1.myBubbleSort(arr);
		// message for differentiation
		System.out.println("my bubble sort, sorted array");
		q1.printBubbleSort(arr);
		
		QTwo q2 = new QTwo();
		int n = 25;
		System.out.println("Fibonacci sequence");
		q2.FibonacciSequence(n);
		
		// q2 with base case and recursive call
//		System.out.println("\n Fibonacci sequence but from 0");
//		for (int i = 0; i < n; i++) {
//			System.out.print(q2.FibAtZero(i) + " ");
//		}
		
		QThree q3 = new QThree();
		String string = "Flea Bass";
		System.out.println("\n");
		q3.reverseString(string);
		
		QFour q4 = new QFour();
		int factorialInteger = 5;
		System.out.println("\nN Factorial \n" + q4.nthFactorial(factorialInteger));
//		System.out.println(q4.nthFactorialForLoop(factorialInteger));
		
		QFive q5 = new QFive();
		String str = "Murdoc";
		int endNumber = 3;
		System.out.println("\n" + q5.substringByInteger(str, endNumber));
	}
}

