package bankApp;

/**
 * 
 * Interface that represents Base Interest Rate for all bank accounts
 * 
 * Should have 2 methods:
 * 
 * getBaseInterestRate()
 * 
 * setInterestRate()
 *
 */

public interface BaseInterestRate {
	
	/*
	 * 
	 * This method returns the base interest rate set by the central bank It must
	 * return the base interest rate of 2.5 %
	 * 
	 */
	// getBaseInterestRate() method definition and implementation goes here

	public default double getBaseInterestRate() {
		return 2.5;
	}
	
	/*
	 * this abstract method sets the specific interest rate for each account type
	 * 
	 * Will be implemented by all concrete classes with class specific
	 * implementation
	 * 
	 * 
	 * 
	 */

	public abstract double setInterestRate(); //method definition goes here

}
