package myPackage;

// Reverse a string without using a temporary variable. Do NOT use reverse() in the 
// StringBuffer or the StringBuilder APIs

public class QThree {

	
	public void reverseString(String n) {
		// variable to hold reversed string
		String newString = "";
		// variable to hold each iteration
		char x;
		System.out.print("Reversing " + n + "... \n");
		
		// for loop to iterate through each character in the string
		for (int i = 0; i <n.length(); i++) {
		x = n.charAt(i); // sets x as the letter we are looking at
		newString = x+newString; // adds the x value at the beginning of the new string
		}
		System.out.println(newString);
	}
}