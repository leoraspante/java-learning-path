// Service class designated for performing mathematical calculations and display the main menu.

package model.services;

import model.entities.NumberValue;

public class Services {

	// Method for displaying menu.
	public static void showMenu() {
		System.out.println("Even Odd Checker");
		System.out.println();
	}
	
	// Method responsible for determining if a value is even or odd.
	public static String evenOddChecker(NumberValue number) {
		if(number.getValue() %2==0) {
			return "Even number";
		}
		else {
			return "Odd number";
		}
	}
	
}
