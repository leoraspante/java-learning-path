// Service class responsible for performing mathematical calculations and display messages.

package model.services;

import model.entities.NumberValue;

public final class Services {

	// Method dedicated for displaying menu.
	public static void showMenu() {
		System.out.println("Interval Validator");
		System.out.println();
		System.out.println("Valid intervals: [0,25], (25,50], (50,75], (75,100]");
		System.out.println();
	}
	
	// Method responsible for obtaining the interval.
	public static String intervalChecker(NumberValue number) {
		double value = number.getValue();
		if(value < 0 || value > 100) {
			return "Out of interval";
		}
		else if (value >=0 && value <= 25) {
			return "Interval [0,25]";
		}
		else if (value > 25 && value <= 50) {
			return "Interval (25,50]";
		}
		else if (value > 50 && value <= 75) {
			return "Interval (50,75]";
		}
		else {
			return "Interval (75,100]";
		}
	}
}
