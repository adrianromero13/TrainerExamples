package myPackage;

//  Write a program to compute N factorial.

public class QFour {

	public int nthFactorial(int n) {
		// nthFactorial(3) => 1*2*3 = 6
		
		// if n = 1 => ans = 1 
		// if n = 2 => ans = 2
		if (n <= 2) {
			return n; // since ans = n
		}
		// use recursion to multiply the answer with n-1 until n returns 1
		return n*nthFactorial(n-1); 
	}
	
	public long nthFactorialForLoop (int n) {
		// use Long in case the number is big
		long factorial = 1;
		for (int i = 2; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
