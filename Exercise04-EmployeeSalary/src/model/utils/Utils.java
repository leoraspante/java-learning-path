// Utility class providing methods for user input validation and menu display.

package model.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {

	// Method dedicated for read and validate employee's value per hour.
	public static Double readValuePerHour(String msg, Scanner sc) {
		double minValuePerHour = 5.00; // Here you can change the minimum value acceptable for base salary.
		while(true) {
			try {
				System.out.print(msg);
				double value = sc.nextDouble();
				if(value < minValuePerHour) {
					System.out.printf("Too low value per hour, please try again.%n%n");
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
	
	// Method dedicated for read and validate worked hours.
	public static Double readWorkedHours(String msg, Scanner sc) {
		int minWorkedHour = 0; // Here you can change the minimum value acceptable for worked hour.
		while(true) {
			try {
				System.out.print(msg);
				double value = sc.nextDouble();
				if(value < minWorkedHour) {
					System.out.printf("Invalid worked hour value, please try again.%n%n");
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
	
	// Method dedicated for read and validate names.
	public static String readName(String msg, Scanner sc) {
		while(true) {
			System.out.print(msg);
			String value = sc.nextLine().trim();
			if(value.trim().isEmpty()) {
				System.out.printf("Empty spaces are not acceptable, please try again.%n%n");
			}
			else if(!value.matches("[A-Za-zÀ-ÿ ]+")) {
				System.out.printf("Invalid name, please try again.%n%n");
			}
			else {
				return value;
			}
		}
	}
	
	// Method dedicated for displaying start menu.
	public static void mainMenu() {
		System.out.println("Employee Payment Calculator");
		System.out.println();
	}
	
}
