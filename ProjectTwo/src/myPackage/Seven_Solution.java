package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Seven_Solution {
	
	public class Employee implements Comparator<Employee> {
		String name, department;
		Integer age; // use of "Wrapper class" - wraps primitive and provides extra functionality
		
		
		public int compare(Employee employee, Employee otherEmployee) {
			if (employee.name == otherEmployee.name) {
				// sort on other attributes
				
				if(employee.department == otherEmployee.department) {
					// sort by age
					return employee.age.compareTo(otherEmployee.age);
				} else {
					return employee.department.compareTo(otherEmployee.department);
				}
			} else {
				return employee.name.compareTo(otherEmployee.name);
			}
		}
		public String toString() {
			// this method used to print out array
			return name + ", " + department + ", " + age;
		}
	}
	
	public void Compare() {
		Employee john = new Employee();
		john.name = "John";
		john.department = "Accounting";
		john.age = 40;
		
		Employee tim = new Employee();
		tim.name = "Tim";
		tim.department = "Accounting";
		tim.age = 47;
		
		Employee john2 = new Employee();
		john2.name = "John";
		john2.department = "Accounting";
		john2.age = 39;
		
		Employee tim2 = new Employee();
		tim2.name = "Tim";
		tim2.department = "Sales";
		tim2.age = 38;
		
//		Employee[] employees = new Employee[] { john, tim, john2, tim2 };
		
		// create an ArrayList
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(john);
		employees.add(tim);
		employees.add(john2);
		employees.add(tim2);
		
		Collections.sort(employees, new Employee());
		
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i).toString());
		}
		
	}

}
