package Driver;

import myPackage.Q1;
//import myPackage.Q7;
import myPackage.Q6;
import myPackage.Q10;
import myPackage.Q11;
import myPackage.Q12;
import myPackage.Q13;
import myPackage.Q14;
import myPackage.Q15;
import myPackage.Q16;
import myPackage.Q17;
import myPackage.Q18_Subclass;
import myPackage.Q19;
import myPackage.Q2;
import myPackage.Q20;
import myPackage.Seven_Solution;
import myPackage.Q3;
import myPackage.Q4;
import myPackage.Q9;
import myPackage.Q8;
import myPackage.Q5;

public class Driver {

	public static void main(String[] args) {

		Q1 q1 = new Q1();
		q1.myBubbleSort();
		System.out.println("my bubble sort, sorted array");
		q1.printBubbleSort();

		Q2 q2 = new Q2();
		int n = 25;
		System.out.println("Fibonacci sequence");
		q2.FibonacciSequence(n);

		Q3 q3 = new Q3();
		String string = "Flea Bass";
		System.out.println("\n");
		q3.reverseString(string);

		Q4 q4 = new Q4();
		int factorialInteger = 5;
		System.out.println("\nN Factorial \n" + q4.nthFactorial(factorialInteger));
//		System.out.println(q4.nthFactorialForLoop(factorialInteger));

		Q5 q5 = new Q5();
		String str = "Murdoc";
		int endNumber = 3;
		System.out.println("\n" + q5.substringByInteger(str, endNumber) + "\n");// q5.TestSubstring(endNumber);;

		Q6 q6 = new Q6();
		int evenNum = 22;
		int oddNum = -3;
		boolean evenAns = q6.isEven(evenNum);
		boolean oddAns = q6.isEven(oddNum);
		System.out.println("Is Number (" + evenNum + ") even? - " + evenAns);
		System.out.println("Is Number (" + oddNum + ") even? - " + oddAns);

		Seven_Solution s7 = new Seven_Solution();
		s7.Compare();

		Q8 q8 = new Q8();
		String[] arrayList = { "karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy",
				"did" };
		q8.separateArray(arrayList);
		System.out.println("\nPalindromes: " + q8.getPalindromeList());
		System.out.println("Not Palindromes: " + q8.getNotPalindromeList());

		Q9 q9 = new Q9();
		q9.primeNumbers();

		Q10 q10 = new Q10();
		System.out.println("\n\nWhat 2 numbers is smaller?");
		q10.smallerNum();

//		Q11 q11 = new Q11();
		Q11.printfloats();

		Q12 q12 = new Q12();
		q12.evenNumbers();


		Q13.PrintTriangle(4);


		int command1 = 1;
		int command2 = 2;
		int command3 = 3;
		Q14.takeCommand(command1);
		Q14.takeCommand(command2);
		Q14.takeCommand(command3);
		
		Q15 q15 = new Q15();
		q15.Interface();
		
		// use command line to pass in args
//		Q16.StringCount(args[0]); // uses command line to take arg
//		if(args.length > 0) {
//			System.out.println(args[0].length());
//		} else System.out.println("Nothing to see here");
		
		Q17 q17 = new Q17();
		q17.InterestCalc();
		
		Q18_Subclass q18 = new Q18_Subclass();
		System.out.println(q18.hasUppercaseLetter("\nmy name is Adrian"));
		System.out.println(q18.hasUppercaseLetter("mammals are hairy"));
		System.out.println(q18.hasUppercaseLetter("Who want's to be a millionaire"));
		
		System.out.println(q18.toUpperCase("the quick brown fox jumps over the lazy dog"));
		System.out.println(q18.stringToInt("Adrian"));
		
		Q19 q19 = new Q19();
		q19.Displays();

		Q20 q20 = new Q20();
		q20.loadData();
	}
}
