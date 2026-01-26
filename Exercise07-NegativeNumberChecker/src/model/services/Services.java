// Service class designated for performing mathematical calculations and show display menu.

package model.services;

import model.entities.NumberValue;

public final class Services {
	
	// Method dedicated for displaying the main menu.
	public static void showMenu() {
		System.out.println("Negative Number Check");
		System.out.println();
	}
	
	// Method dedicated for check if a number is negative.
	public static String checkNegative(NumberValue number) {
		int value = number.getValue();
		if(value < 0) {
			return "Negative number";
		}
		else {
			return "Positive number";
		}
	}

}
