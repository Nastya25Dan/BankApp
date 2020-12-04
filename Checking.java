package bankApp;

/**
 * 
 * A class that represents a Checking account Must extend abstract Account class
 * to inherit generic account properties and behaviors
 *
 *
 */

public class Checking extends Account {

	/*
	 * Declare the following fields for Checking account:
	 * 
	 * debitCardNo - represents a debit card number debitCardPIN - represents a
	 * debit card pin
	 * 
	 * Fields must be properly encapsulated
	 */

	// Field declarations go here
	
	private long debitCardNo;
	private int debitCardPIN;
	
	
	/*
	 * Constructor that initializes Checking account object
	 * 
	 * Besides calling its super class constructor, this constructor must do the
	 * following:
	 * 
	 * - change accountNumber for Checking account by adding "1" before super
	 * class's accountNumber
	 * - initialize debitCardNo by generating 16-digit random
	 * number
	 * - initialize debitCardPIN by generating 4-digit random number
	 * - set the interest rate by calling setInterestRate() method
	 */

	public Checking(String name, String ssn, double balance) {
		super(name, ssn, balance);
		accountNumber = "1" + super.accountNumber;
		this.debitCardNo = (1000000000000000L + (long) (Math.random() * 1000000000000000L));
		this.debitCardPIN = 1000 + (int) (Math.random() * 9999);
		setInterestRate();
	}

	/*
	 * Override super class's showInfo() method by ADDING Checking account specific info
	 * such as account type, debitCardNo, debitCardPIN and interestRate
	 * 
	 * Ex:
	 * 	NAME: Marybeth Sanders
		SSN: 431551383
		ACCOUNT NUMBER: 1138372589466
		BALANCE: 2500.0
		ACCOUNT TYPE: Checking
		DEBIT CARD NUMBER: 6804579327874081
		DEBIT CARD PIN: 8689
		INTEREST RATE: 0.375%
	 * 
	 */
     //showInfo() method definition and implementation goes here
	
	public void showInfo(){
		super.showInfo();
		System.out.println("ACCOUNT TYPE: " + "Checking" + '\n'
						+ "DEBIT CARD NUMBER: " + debitCardNo + '\n'
						+ "DEBIT CARD PIN:" + debitCardPIN + '\n'
						+ "INTEREST RATE:" + setInterestRate() + "%");
	}


	/*
	 * Implement setInterestRate() method of BaseInterestRate interface
	 * 
	 * Checking account interest rate must be set to 15% of the interestRate declared in Account class
	 */
	// setInterestRate() method definition and implementation goes here

	public double setInterestRate() {
		return super.interestRate * 0.15;
	}

}
