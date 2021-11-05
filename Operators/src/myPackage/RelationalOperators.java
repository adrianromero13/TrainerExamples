package myPackage;

public class RelationalOperators {

	public class DemoObject {
		public DemoObject (int data) {
			this.data = data;
		}
		
		int data;
		
		public boolean equals(DemoObject other) {
			return this.data == other.data;
		}
	}
	
	
	public void operate() {

		/*
		 * Relation Operators (primitives only) < -> Less than > -> greater than <= ->
		 * Less than or equal to >= -> Greater than or equal to == -> Equal to. NOTE:
		 * EQUAL TO operator is different from the ASSIGNMENT operator (=) != -> Not
		 * equal to
		 */

		int a = 5, b = 7;

		if (a < b)
			System.out.println("a is less than b!");
		
		if (a == b);
		
		if (a != b);
		
		// Objects can't benefit from relational operators! References to objects are different from the objects themselves.
		DemoObject object_a = new DemoObject(5);
		DemoObject object_b = new DemoObject(5);

// The two objects below 
		boolean objectsEqual = (object_a == object_b);
		System.out.println(objectsEqual);
		System.out.println("Value of Object A: " + object_a);
		System.out.println("Value of Object B: " + object_b);
		
		// The 'correct' way of comparing objects is OVERRIDING the equals method of the Object class
		System.out.println("But do they have the same data? " + object_a.equals(object_b));

	}
}
