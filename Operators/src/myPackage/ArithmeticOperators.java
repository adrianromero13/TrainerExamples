package myPackage;

public class ArithmeticOperators {

	public void operate() {
		/*
		 * Standard Arithmetic operators:
		 * + -> Addition
		 * - -> Subtraction
		 * * -> Multiplication
		 * / -> Division
		 * ()-> Parenthesis for making statements evaluate independently
		 * % -> Modulo - returns the remainder of some integer division
		 * NOTE: we do NOT have ^, this initiates a bit-shifting operation
		 * ^ To do exponential math, you;ll need an official Math library
		 */
		
		int x = 5 + 5 * 10 - 3 / 2;
		System.out.println(x);
		
		int y = 5 * (2 + 2)/5 -2;
		System.out.println(y);
		
		// All arithmetic operators require two operands, that is if using +, there should be a number on both sides
	}
	
}
