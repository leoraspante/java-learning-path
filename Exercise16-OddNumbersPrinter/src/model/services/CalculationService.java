// Service class responsible for performing mathematical calculations.

package model.services;

import model.entities.NumberValue;

public class CalculationService {

	// Method responsible for performing odd numbers calculations.
	public static void oddChecker(NumberValue number) {
		int numValue = number.getValue();
		ConsoleMessageService.printResultMessage(numValue);
		for (int i = 1; i <= numValue; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		ConsoleMessageService.printEndMessage();
	}
	
	
}
