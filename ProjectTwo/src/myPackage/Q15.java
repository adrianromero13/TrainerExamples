package myPackage;

/*
 * Question 15: Write a program that defines an interface having the following methods: addition, 
 * subtraction, multiplication, and division. Create a class that implements this interface and provides 
 * appropriate functionality to carry out the required operations. Hard code two operands in a test 
 * class having a main method that calls the implementing class.
 */


// Interfaces cannot be instantiated (i.e. line 16)
public class Q15 {

	public void Interface() {
	
//		Q15_Interface q15 = new Q15_Interface();
		
		Q15_Interface q15 = new Q15_Impl();
		Result(q15);
	}
	
	public void Result(Q15_Interface q15) {
		System.out.println(q15.addition(5, 10));
	}
}
