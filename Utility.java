package bankApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Utility {
	/*
	 * Implement a static utility method that reads from a .txt file and returns the information in the file
	 * as a List of String [], where each element (i.e String[] ) represents each line in the file
	 * which contains all the required information about each customer (name, ssn, accountType, initialBalance)
	 * 
	 * To read from a file use Scanner class and nextLine() method
	 * 
	 * Use try-catch block to handle the FileNotFoundException
	 *
	 * Optionally use try-with-resources statement to auto-close the Scanner object 
	 */
	public static List<String[]> readFromAFile(String pathToTheFile) throws FileNotFoundException {
		// implementation goes here
		List<String[]> list = new ArrayList<>();

		File f = new File(pathToTheFile);

		try (Scanner sc = new Scanner(f);) {

			while (sc.hasNext()) {

				list.add(sc.nextLine().split(","));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return list;
	}

}
