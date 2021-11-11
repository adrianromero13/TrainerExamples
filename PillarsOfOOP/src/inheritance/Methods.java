package inheritance;

public class Methods {

	public void Speak() {
		Child c = new Child();
		c.PrintSelf();
	}
	
	public static void Speak(Parent p) {
		p.PrintSelf();
	}
	
}
