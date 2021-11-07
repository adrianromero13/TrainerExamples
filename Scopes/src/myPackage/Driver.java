package myPackage;

public class Driver {

	// scopes are going to limit where you can see a variable
	/*
	 * Class Scope (static, available anywhere by simply addressing the class; instances of the class are not required)
	 * Object/Instance Scope (belong only to a particular object)
	 * Method Scope (belong only to a particular method while its running)
	 * Block Scope (anything between two curly braces is within that block's scope)
	 * 
	 * Loop Scope (like any time i is used in a for loop
	 * Static Method Scope
	 * 
	 * Shadowing 
	 * Loop Scope / Block Scope > Method Scope > Instance Scope / Class Scope
	 */
	public static void main(String[] args) {
		// moreData belongs to CLASS scope, and does not require an instance
		System.out.println(MyObject.moreData);
		
		// Because myData is instance scope, we need an instance to use it. The following line produces an error
//		System.out.println(MyObject.myData);
		
		// instances are made with the new kewword
		MyObject obj = new MyObject();
		// this particular object now carries data that ca be referenced by the name myData
		System.out.println(obj.myData);
		
//		int i = obj.moreData; => fails because trying to access a static variable in a non-static way
	}
	
}
