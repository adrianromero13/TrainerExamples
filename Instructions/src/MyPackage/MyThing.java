package MyPackage;

public class MyThing {

	// when doing a series of checks (i.e. boolean statements), we can use the
	// keywords if, else to chain them together
	public void ifStatements(String[] arg) {

		boolean signedUp = true, qualifiesForPremium = false;
		int age = 20;

		if (signedUp) {
			if (qualifiesForPremium && age >= 21) {
				// Give premium service
			} else {
				// in all other cases, give regular service
			}
		}

		if (signedUp) {

		} else if (age > 20) {
			// this will only run if signedUp is FALSE and age is greater than 20
		} else if (age > 15) {

		} else if (age > 10) {

		} else {
			// usually best practice to have an else block. At minimum can put errors here
			// if this code should never run
			// or we simply need to catch all remaining cases
		}
	}
	
	public void switchStatement(String[] arg) {
		
		// Each potential value that we are checking should have a case
		String command = "message";
		switch (command) {
		case "download":
			System.out.println("Downloading a file!");
			// use break if you want to immediately exit a block (i.e. anything between { } )
			// even if there are more lines of code to run on the block
			break;
			
		case "message":
			System.out.println("Message has been sent!");
			break;
			
		case "upload":
			System.out.println("Uploading!");
			break;
			
		// This case runs if no other case is selected
		default:
			System.out.println("No other cases matched...");
		}
	}
}
