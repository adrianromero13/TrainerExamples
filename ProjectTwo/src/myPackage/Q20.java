package myPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q20 {

	public void loadData() {

		Scanner read;
		ArrayList<Person> people = new ArrayList<Person>();

		try {
			// open file
			read = new Scanner(new File("Data.txt"));
			read.useDelimiter(":|\\n");

			// parse file
			while (read.hasNext()) {
				Person p = new Person();
				p.firstName = read.next();
				p.lastName = read.next();
				p.age = Integer.parseInt(read.next());
				p.state = read.next();

				// add using Person class
				people.add(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (Person p : people) {
			System.out.println("Name: " + p.firstName + " " + p.lastName);
			System.out.println("Age: " + p.age);
			System.out.println("State: " + p.state);
		}
	}
}

class Person {
	String firstName, lastName, state;
	int age;
}
