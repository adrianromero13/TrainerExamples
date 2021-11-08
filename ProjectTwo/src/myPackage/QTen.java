package myPackage;

import java.util.Scanner;

/*
 *  Question 10: Find the minimum of two numbers using ternary operators.
 */

public class QTen {
	// variables
	int first, second, ans;
	
	public void smallerNum() {
		
	// Start scanner and ask user to give two numbers
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter First Number:");
	first = scanner.nextInt(); 
	
	System.out.println("Enter Second Number");
	second = scanner.nextInt();
	
	// close scanner before performing logic
	scanner.close();
	
	ans = first < second ? first:second;
	System.out.println("Smaller number is: " + ans);
	}
	

}
