package myPackage;

import otherPackage.ExternalObject;

public class Driver {
	
	public static void main(String[] args) {
		
		MyObject o = new MyObject();
		
//		o.privateData //is not available because the variable is modified as private
		
		MyChildObject c = new MyChildObject();
	
		ExternalObject eo = new ExternalObject();
		
	}
}
