package driver;

import abstraction.MyConcreteClass;
import inheritance.Child;
import inheritance.Methods;
import inheritance.Parent;
import polymorphism.FoodMethods;

public class Driver {

	public static void main(String[] args) {
		
		Child c = new Child();
		Parent p = new Parent();
		
		// Here, the child is upcasted implicitly to its parent
		Methods.Speak(c);
		
		FoodMethods.testCalcuateFood();
		
		MyConcreteClass.testSelf();
	}
}
