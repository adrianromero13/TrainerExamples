package myPackage;

import myOtherPackage.ExternalVariables;


/*
 * Question 10: Write a program that would access two float-variables from a class that exists in another 
 * package. Note, you will need to create two packages to demonstrate the solution.
 */

public class Q11 {
// print out variables
	public static void printfloats() {
		// instantiate ExternalVariables
		ExternalVariables ev = new ExternalVariables();
		System.out.println("floatA from myOtherPackage: " + ev.floatA);
		System.out.println("floatB from myOtherPackage: " + ev.floatB);
	}
}
