package myPackage;

import java.util.Comparator;

/* 
 * Question 7: Sort two employees based on their name, department, and age using the Comparator 
 * interface.
 */

public class Q7 {
	
	// two parameters (employee one, employee two)
	/*
	 * each parameter will have name, department and age
	 * i.e. employee{name: "name", department: "department", age: int}
	 */
	
	// common variables
	String name, department;
	int age;
	
	// Constructor for employee
	public Q7(String name, String department, int age) {
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
class SortByName implements Comparator<Q7> {
	// create a compare by name method
	public int compare(Q7 a, Q7 b) {
		// return the name in (a, b) order
		return a.name.compareTo(b.name);
	}
}

// comparator for Department
class SortByDepartment implements Comparator<Q7> {
	public int compare(Q7 a, Q7 b) {
		return a.department.compareTo(b.department);
	}
}

// comparator for Age
class SortByAge implements Comparator<Q7> {
	public int compare(Q7 a, Q7 b) {
		return a.age - b.age;
	}
}

