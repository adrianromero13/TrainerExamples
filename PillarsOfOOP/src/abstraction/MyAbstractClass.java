package abstraction;


/*
 * Abstraction keywords
 * - 'abstract' 	indicates an abstract class
 * - 'extends' 		used to create child class
 * - 'implements' 	used to flag a class as implementing some interface
 */
public abstract class MyAbstractClass {

	public void MyAbstractClassMethod(int a) {
		System.out.println("From MyAbstractClass: " + a);
	}
}
