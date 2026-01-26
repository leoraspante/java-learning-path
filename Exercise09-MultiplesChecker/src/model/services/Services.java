// Service class responsible for performing mathematical calculations and display main menu.

package model.services;

import model.entities.NumberValue;

public final class Services {

	// Method responsible for displaying main menu.
	public static void showMenu() {
		System.out.println("Multiple Numbers Checker");
		System.out.println();
	}
	
	// Method responsible for checking multiple numbers.
	public static String multipleChecker(NumberValue number) {
		int firstValue = number.getFirstValue();
		int secondValue = number.getSecondValue();
		if((firstValue % secondValue == 0) || (secondValue % firstValue == 0)) {
			return "Multiple numbers";
		}
		else {
			return "Not multiples";
		}
	}
}
