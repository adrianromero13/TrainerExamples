package inheritance;

/*
 * We can observe that child classes can do anything their parent can do,
 * but parents do not receive functionality from their children.
 */

public class Child extends Parent{

	// override to get another functionality
	public void PrintSelf() {
		System.out.println("I am the Child");
	}
	public void BeAChild() {
		System.out.println("Wow I am having fun!");
	}
}
