package myPackage;

public class MyObject {
	
	/*
	 * Access Modifiers:
	 * public - Accessible anywhere
	 * private - Accessible only by the owning class
	 * protected - Carried down through inheritance. Accessible to any class in its own package, or any subclass in any package.
	 * default (no modifier) - Public to fellow classes in the same package, private to all others
	 */
	
	// Public allows data or methods to be accessed from anywhere and from any package so long as the class is imported
	// Most permissible
	public int myData = 1;
	
	// Private is on the other end of the spectrum
	// only the class in which the variable is define has access to it
	private int privateData = 5;

	
	// Protected data and methods are specifically marked as being passed down to children and can be accessed similarly to public members
	protected int protectedData = 6;
	
	// No access modifier means 'default' access:
	// free to any class in the same package
	int defaultData = 2;
}
