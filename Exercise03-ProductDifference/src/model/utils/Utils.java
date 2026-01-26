// Utility class providing methods for user input validation and menu display.

package model.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {

	// Method dedicated for read and validate double values.
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
	
	// Method dedicated for displaying menu.
	public static void simpleMenu() {
		System.out.println("Product Difference Calculator");
		System.out.println();
		System.out.println("Calculate the difference between two products");
		System.out.println("(AxB - CxD");
		System.out.println();
	}
}
