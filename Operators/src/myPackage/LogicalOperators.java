package myPackage;

public class LogicalOperators {

	boolean hasAccount = true, hasInvestmentAccount = false;
	float accountValue = 1000.0f; 
	
	public void operate() {
		// I need people who have regular accounts AND investment accounts 
		// This is a situation for && - the AND operator
		if (hasAccount && hasInvestmentAccount)
			// in cases where there is only one line to run that is contingent upon the preceding control statement,
			// the { } can be omitted
			System.out.println("Then have both kinds of accounts!");
		
		// Let's say instead I want someone who is EITHER a regular account holder OR investor
		// OR operator "||"
		if (hasAccount || hasInvestmentAccount)
			System.out.println("They have some kind of account!");
		
		// Let's say I need to check that something is NOT TRUE
		// use the negation operator (bang operator) "!"
		if (!hasAccount && !hasInvestmentAccount)
			System.out.println("They have no accounts!");
		
		// For more complex logical statements, ( ) are often required as they help make statements evaluate independently
		if ( (hasAccount && accountValue > 500.0f) || hasInvestmentAccount)
				System.out.println("They are a premium client");
		
		// NOTE: when stringing together logical statements in one if-block, parentheses take precedence,
		// but otherwise logical operators are evaluated left-to-right, AND!
		// if a statement is evaluated false, and its falseness would preclude the rest of the statement from being true
		// the evaluation immediately ends (called SHORT-CIRCUIT LOGIC)
	}
}
