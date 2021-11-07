package myPackage;

/*
 * Write a substring method that accepts a string str and an integer idx and returns the substring 
 * contained between 0 and idx-1 inclusive. Do NOT use any of the existing substring methods in 
 * the String, StringBuilder, or StringBuffer APIs
 */

public class QFive {
	// enter a string and a number...
	// return the characters in the string up to the number given
	public String substringByInteger(String str, int idx) {
		// a character variable to hold each iteration of the string
		char letter;
		// new string
		String newStr = "";
		int l = str.length() - (str.length() - idx);

		for (int i = 0; i < l; i++) {
			// sets x as the letter we are looking at
			letter = str.charAt(i);
			// adds the x value at the beginning of the new string
			newStr = newStr + letter;
		}
		return newStr;
	}

	// work solution
	public String SubstringSolution(String str, int idx) {

		// set up input array and output array
		char[] charArray = str.toCharArray();
		char[] substringArray = new char[idx];

		// copy over substring
		for (int i = 0; i < idx; ++i) {
			substringArray[i] = charArray[i];
		}

		// Turn the substring into a String
		return new String(substringArray);
	}

	String testString = "My test string";

	public void TestSubstring(int idx) {
		System.out.println(SubstringSolution(testString, idx));
	}
}
