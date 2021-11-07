package driver;

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
			
		} catch (Exception e){
			System.out.println("Hey! you have to type an integer!");
		}
	}
}

	// adding method
	public static int add(int a, int b) {
		return a + b;
	}
}
