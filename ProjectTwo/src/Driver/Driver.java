package Driver;

import myPackage.QOne;
import myPackage.QSeven;
import myPackage.QSix;
import myPackage.QTen;
import myPackage.QTwo;
import myPackage.QThree;
import myPackage.QFour;
import myPackage.QNine;
import myPackage.QEight;
import myPackage.QFive;

import java.util.ArrayList;
import java.util.Collections;


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
//		q5.TestSubstring(endNumber);;
		
		QSix q6 = new QSix();
		int evenNum = 22;
		int oddNum = -3;
		boolean evenAns = q6.isEven(evenNum);
		boolean oddAns = q6.isEven(oddNum);
		System.out.println("Is Number (" + evenNum + ") even? - " + evenAns);
		System.out.println("Is Number (" + oddNum + ") even? - " + oddAns);
		
//		QSeven q7 = new QSeven();
//		// Seven requires an ArrayList for each employee
//		ArrayList<QSeven> employee = new ArrayList<QSeven>();
//		employee.add(new QSeven("Jane", "Supervisor", 33));
//		employee.add(new QSeven("Adrian", "Manager", 49));
//		
//		System.out.println("\nSorted By Name");
//		Collections.sort(employee, new q7.SortByName());
//
//		for (int i = 0; i < employee.size(); i++)
//			System.out.println(employee.get(i));
//		
//		
//		System.out.println("\nSorted By Department");
//		Collections.sort(employee, new q7.SortByDepartment());
//		for (int i = 0; i < employee.size(); i++)
//			System.out.println(employee.get(i));
//		
//		System.out.println("\nSorted By Age");
//		Collections.sort(employee, new q7.SortByAge());
//		for (int i = 0; i < employee.size(); i++)
//			System.out.println(employee.get(i));
		
		
		
		QEight q8 = new QEight();
		 String[] arrayList= {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"} ;
		 q8.separateArray(arrayList);
	
		 System.out.println("\nPalindromes: " + q8.getPalindromeList());
		 System.out.println("Not Palindromes: " + q8.getNotPalindromeList());
		 
		 QNine q9 = new QNine();
		 q9.primeNumbers();
		 
		 QTen q10 = new QTen();
		 System.out.println("\n\nWhat 2 numbers is smaller?");
		 q10.smallerNum();
		 
	}
}

