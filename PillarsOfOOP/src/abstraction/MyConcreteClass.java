package abstraction;

// any class that is not abstract (that can be instantiated) is a concrete class
public class MyConcreteClass extends MyAbstractClass implements MyInterface{

	@Override
	public void InterfaceMethod(int a) {
		System.out.println("From myConcreteClass: " + a);
		
	}
	
	public static void testSelf() {
		// create instance to work with class
		MyConcreteClass mcc = new MyConcreteClass();
		
		mcc.InterfaceMethod(5);
		mcc.MyAbstractClassMethod(17);
	}

}
