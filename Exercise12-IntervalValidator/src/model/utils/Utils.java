// Utility class for read/validate user's input.

package model.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {
	
	// Method responsible for read and validate double values.
	public static Double readDouble(String msg, Scanner sc) {
		while(true) {
			try {
				System.out.print(msg);
				double value = sc.nextDouble();
				return value;
			}
			catch(InputMismatchException e) {
				System.out.printf("Only numeric values are acceptable, please try again.%n%n");
				sc.nextLine();
			}
		}
	}

}
