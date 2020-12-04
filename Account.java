package bankApp;

/**
 * Abstract class that represents a generic Bank Account
 * 
 * Must implement BaseInterestRate interface to obtain base interest rate and
 * set interest rate for specific concrete classes
 *
 */

public abstract class Account implements BaseInterestRate {
	
	/*
	 * Declare the following fields:
	 * 
	 * name - represents an accountholder's full name ssn - represents an
	 * accountholder's ssn balance - represents the balance of the account
	 * accountNumber - represents the unique id of the account interestRate -
	 * represents the base interest rate for all accounts
	 */

	// Field declarations go here
	protected String name;
	protected String ssn;
	protected double balance;
	protected String accountNumber;
	protected double interestRate;
	
	/*
	 * Constructor to set all 5 fields
	 * 
	 * accountNumber field must be initialized by calling the
	 * generateAccountnumber() method
	 *
	 * interestRate field must be initialized by calling the getBaseInterestRate()
	 * method of BaseInterestRate interface
	 *
	 */
	public Account(String name, String ssn, double balance) {
		// implementation goes here
		this.name = name;
		this.ssn = ssn;
		this.balance = balance;
		this.accountNumber = generateAccountnumber();
		this.interestRate = getBaseInterestRate();
	}

	/*
	 * method to generate a generic Account number and to initialize accountNumber
	 * field in the constructor.
	 * 
	 * It should be generated as: Last 3 digits of ssn + random 6 digit number
	 * 
	 * 
	 */
	protected String generateAccountnumber() {
		String last3ssn = this.ssn.substring(6);
		return accountNumber = last3ssn + (int) (100_000 + Math.random() * 999_999);

	}
	
	/*
	 * adds the given amount to the balance and prints out a message ->
	 * "YOUR BALANCE IS: " + balance
	 */
	public void deposit(double amount) {
		// implementation goes here
		balance = amount + balance;
		System.out.println("YOUR BALANCE IS: " + balance);
	}
	
	
	/*
	 * subtracts the given amount from the balance and prints out a message ->
	 * "YOUR BALANCE IS: " + balance
	 * 
	 * if the amount that is being withdrawn is larger than the balance prints out a
	 * message -> "AMOUNT TO BE WITHDRAWN EXCEEDS THE BALANCE"
	 */
	public void withdraw(double amount) {
		// implementation goes here

		if (balance < amount) {
			System.out.println("AMOUNT TO BE WITHDRAWN EXCEEDS THE BALANCE");
		} else {
			balance = balance - amount;
			System.out.println("YOUR BALANCE IS: " + balance);
		}
	}
	
	/*
	 * Prints information about the account
	 * 
	 * Information should include name, ssn, accountNumber and balance printed on
	 * separate lines Ex:
	 * 
	 * NAME: Arielle Duncan SSN: 444102638 ACCOUNT NUMBER: 2263869065803 BALANCE:
	 * 1000.0
	 */
	public void showInfo() {
		System.out.println("NAME: " + name + '\n' + 
							"SSN: " + ssn + '\n' +
							"ACCOUNT NUMBER: " + accountNumber + '\n' +
							"BALANCE: " + balance);
		
	}
	
	

}
