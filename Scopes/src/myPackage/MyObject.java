package myPackage;

public class MyObject {
	// A variable that belongs to instances of the class
	public int myData = 1;
	
	public static int moreData = 5;

	// The myData in this method belongs to the METHOD scope, and SHADOWS the instance-level myData
	// That is, because it is the more specific scope, the below value of myData will be used by default
	// rather than the instance-level myData
	public void myMethod() {
		int myData = 2;
		
		// In order to reach the instance-level myData we need to use 'this'
		// this.myData;
	}
}
