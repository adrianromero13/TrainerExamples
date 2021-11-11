package myPackage;

import java.util.ArrayList;
//import java.util.Arrays;

/*
 * Question 8: Write a program that stores the following strings in an ArrayList and saves all the palindromes 
 * in another ArrayList.
 * “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”, “refer”, “billy”, “did”
 * 
 */

public class Q8 {
	// use ArrayList java.util to create new arrays dynamically based on size
	ArrayList<String> palindromes = new ArrayList<String>();
	ArrayList<String> notPalindromes = new ArrayList<String>();
	
	public void separateArray(String [] list) {
		// set palindrome in one array and any other, in a second array
		for (int i = 0; i < list.length; i++) {
			if (isPalindrome(list[i]) == true) {
			palindromes.add(list[i]);
			} else {
				notPalindromes.add(list[i]);
			}
		} 
	}
	
	
	public boolean isPalindrome(String listItem) {
		int length = listItem.length();
		int halfLength = listItem.length()/2;
		int indicator = 0;
		
		// check if list item is a palindrome
		for (int i = 0; i < halfLength; i++) {
			// compare the first char to the last char and repeat until it returns false, or you run out of char
			if(listItem.charAt(i) == listItem.charAt(length - 1 - i)) {
				indicator = 0;
			} else {
				indicator = 1;
				break;
			}
		}
		return (indicator == 0);
	}
	
	// then set arrays with getter functions to call them in driver class
	public ArrayList<String> getPalindromeList() {return palindromes;}
	public ArrayList<String> getNotPalindromeList() {return notPalindromes;}
}
