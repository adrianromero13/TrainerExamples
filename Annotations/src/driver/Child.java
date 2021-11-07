package driver;

public class Child extends Parent{

	public Child() {
		myMethod();
	}
	
	@Override
	public void myMethod() {
		System.out.println("Hello! from inside the child class!");
	}
	

}
