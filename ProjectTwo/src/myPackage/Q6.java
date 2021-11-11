package myPackage;

// Write a program to determine if an integer is even without using the modulus operator (%)

public class Q6 {

	
	public int reducedInt(int x) {
		int ans = x;
		while(ans > 0) {
			ans = ans - 2;
		}return ans;
	}
	
	public boolean isEven(int x) {
		int n = x;
		int reduced;
		boolean ans;
		if (x < 0) {
			n = x*-1;
		}
		reduced = reducedInt(n);
		if(reduced == -1) {
			ans = false;
		}else ans = true;
		return ans;
	}
}
