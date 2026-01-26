// Utility class responsible for read and validate user's input.

package model.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {

	// Method dedicated for read and validate products prices.
	public static Double readPrice(String msg, Scanner sc) {
		double minProductValue = 0.0; // Here you can set the minimum value acceptable for products.
		while(true) {
			try {
				System.out.print(msg);
				double value = sc.nextDouble();
				if(value < minProductValue) {
					System.out.printf("Invalid price, please try again.%n%n");
				}
				else {
					return value;
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("Only numeric values are acceptable, please try again.%n%n");
				sc.nextLine();
			}
		}
	}
	
	// Method dedicated for read and validate integer values.
	public static Integer readInt(String msg, Scanner sc) {
		int minValue = 0; // here you can set the minimum value acceptable for user input.
		while(true) {
			try {
				System.out.print(msg);
				int value = sc.nextInt();
				sc.nextLine();
				if(value < minValue) {
					System.out.printf("Invalid value, please try again.%n%n");
				}
				else {
					return value;
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("Only integer numeric values are acceptable, please try again.%n%n");
				sc.nextLine();
			}
		}
	}
	
	// Method dedicated for displaying the start menu.
	public static void showMenu() {
		System.out.println("Product Price Calculator");
		System.out.println();
	}
	
}
