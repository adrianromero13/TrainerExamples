package myPackage;

import java.util.Comparator;

/* 
 * Question 7: Sort two employees based on their name, department, and age using the Comparator 
 * interface.
 */

public class QSeven {
	
	// two parameters (employee one, employee two)
	/*
	 * each parameter will have name, department and age
	 * i.e. employee{name: "name", department: "department", age: int}
	 */
	
	// common variables
	String name, department;
	int age;
	
	// Constructor for employee
	public QSeven(String name, String department, int age) {
		// create encapsulated versions of the variables
		this.name = name;
		this.department = department;
		this.age = age;
	}
	
	// combine details for a single print
	public String toString() {
		// this will concatenate all variables in one string to avoid calling for each
		return this.name +  " " + this.department + " " + this.age;
	}
	

}

// comparator for Name
class SortByName implements Comparator<QSeven> {
	// create a compare by name method
	public int compare(QSeven a, QSeven b) {
		// return the name in (a, b) order
		return a.name.compareTo(b.name);
	}
}

// comparator for Department
class SortByDepartment implements Comparator<QSeven> {
	public int compare(QSeven a, QSeven b) {
		return a.department.compareTo(b.department);
	}
}

// comparator for Age
class SortByAge implements Comparator<QSeven> {
	public int compare(QSeven a, QSeven b) {
		return a.age - b.age;
	}
}

