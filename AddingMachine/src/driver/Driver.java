package driver;

import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		while(true) {
			
		int a = -1, b = -1;
		
		// Read into these numbers
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("First Number: ");
			a = scanner.nextInt();
			
			System.out.println("Second Number: ");
			b = scanner.nextInt();
			
			System.out.println("Sum: " + add(a, b));
//		throw new MyException();
		} catch (Exception e){
			System.out.println("Hey! you have to type an integer!" + e.getMessage());
		}
	}
}

	// adding method
	public static int add(int a, int b) {
		return a + b;
	}


	// When throwing exceptions or using methods that do,
	// those exceptions must either be HANDLED in a try-catch block
	// or declared in the method header using throws
	// Being in this situation means you are using a CHECKED EXCEPTION
	// i.e. checked that it is properly handled by your IDE/compiler
	
	public static void uhOh() throws IOException {
		throw new IOException();
	}
}
