package myPackage;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Scanner;
//import java.util.ArrayList;

/*
 * Question 14: Write a program that demonstrates the switch case. Implement the following functionalities in the 
 * cases:java
 * Case 1: Find the square root of a number using the Math class method.
 * Case 2: Display today’s date.
 * Case 3: Split the following string and store it in a string array.
 * “I am learning Core Java”
 */

public class Q14 {

	public static void takeCommand(int command) {

		int aNumber = 144;
		switch (command) {
		case 1:
			System.out.println("The square root of " + aNumber + " is " + Math.sqrt(aNumber));
			break;
		case 2:
			System.out.println("Today's date is " + LocalDate.now());
			break;
		case 3:
			String whole = "I am learning Core Java";
			String[] parts = whole.split(" ");
			for (String s : parts)
				System.out.println(s);
			break;
		}

	}

}

//		boolean in = true;
// valid commands
//		String command;
//		System.out.println("\nPlease type in one of the following to run a case and press ENTER:");
//		System.out.println("1 - Squareroot a number");
//		System.out.println("2 - Show today's date");
//		System.out.println("3 - Convert a String to an array");
//		System.out.println("q - Exit This Java Program\n");

// instance of Scanner class
//		Scanner scanner = new Scanner(System.in);
//		command = scanner.next();
//		scanner.close();

// while loop to ask again until q is typed
//		if (command == 1 || command == 2 || command == 3) {

//			switch (command) {
//			case 1:
//				squareroot();
//				break;
//			case 2:
//				today();
//				break;
//			case 3:
//				splitString();
//				break;
//			default:
//				System.out.print("failed to input a valid number");
//				break;
////			}
//		}
//	}
//
//	// if square root is chosen
//	public static void squareroot() {
//		System.out.println("type in the number you want to Square Root: ");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		scanner.close();
//		double ans = Math.sqrt(num);
//		System.out.println("The Squareroot of " + num + "is: " + ans);
//	}
//
//	// if today's date is chosen
//	public static void today() {
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/uuuu");
//		LocalDate localDate = LocalDate.now();
//		System.out.println("Today's Date: " + dtf.format(localDate));
//	}
//
//	// if splitString is chosen
//	public static void splitString() {
//		String stringToSplit = "I am learning Core Java";
//
//		// split by spaces and add to array
//		String[] stringArr = stringToSplit.split(" ");
//
//		// print out each word
//		for (String word : stringArr) {
//			System.out.println(word);
//		}
//	}
