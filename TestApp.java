package bankApp;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * 
 * This Runner class is used to obtain customer information from a text file 
 * and create multiple bank accounts based on it and display information about them
 * 
 *
 */

public class TestApp {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//1. Create a List of Accounts and initialize it
		
		List <Account> accounts = new ArrayList<>();
		
		//2. Create a List of customers
		//Read new account holder information from a file customers.txt by calling the 
		//utility method readFromAFile()
		//and store it into a List of String[] 
		
		List<String[]> customers = Utility.readFromAFile("resources/customers.txt");
		
		
		
		//3. Add new accounts to List of Accounts		
		//Loop through the List of customers and get the information for each new customer
		//(name, ssn, accountType, initialBalance )
		// and create a new Savings or Checking account based on the accountType and add that new Account to the 
		// List of Accounts
		
		
		for (String[] customer : customers) {
			// check 3rd element (saving or checking) and add to list of the account
			if (customer[2].contains("Savings")) {
				Savings sv = new Savings(customer[0], customer[1], Double.parseDouble(customer[3]));
				accounts.add(sv);
			} else {
				Checking ch = new Checking(customer[0], customer[1], Double.parseDouble(customer[3]));
				accounts.add(ch);
			}

		}
	
		
		
		//4. Loop through the List of Accounts and 
		// call showInfo() method on each account to display info about each created account
		
		for (Account e : accounts) {
			e.showInfo();
			System.out.println("************************************************************");
		}
	}
		
	}


