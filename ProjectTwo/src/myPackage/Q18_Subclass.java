package myPackage;

/*
 * Question 18: Write a program having a concrete ;subclass that inherits three abstract methods from a 
 * superclass. Provide the following three implementations in the subclass corresponding to the 
 * abstract methods in the superclass:
 * 1. Check for uppercase characters in a string, and return ‘true’ or ‘false’ depending if 
 * any are found.
 * 2. Convert all of the lower case characters to uppercase in the input string, and return 
 * the result.
 * 3. Convert the input string to integer and add 10, output the result to the console.
 * Create an appropriate class having a main method to test the above setup.
 */

public class Q18_Subclass extends Q18_Superclass {

	public boolean hasUppercaseLetter(String s) {

		char[] characters = s.toCharArray();

		for (char c : characters) {

			int numerical = (int) c; // cast character to int

			if (numerical >= 65 && numerical <= 90)
				return true;
		}
		return false;
	}

	public String toUpperCase(String s) {

		char[] characters = s.toCharArray();

		for (int i = 0; i < characters.length; i++) {
			if ((int) characters[i] > 90)
				characters[i] -= 32;
		}

		return new String(characters);
	}

	public int stringToInt(String s) {
// Integer.parseInt(str); 
		char[] characters = s.toCharArray();
		int total = 0;

		for (char c : characters) {
			total += (int) c;
		}
		return total + 10;
	}
}
