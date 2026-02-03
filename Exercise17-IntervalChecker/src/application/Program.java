// Description: Reads N integers and counts how many are within the interval [10,20] ("in") and how many are outside ("out").

package application;

import java.util.Scanner;

import model.entities.NumberValue;
import model.services.CalculationService;
import model.services.ConsoleMessageServices;
import model.utils.InputUtils;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ConsoleMessageServices.printStartMessage();
		NumberValue number = new NumberValue(InputUtils.readInt("Enter the number of inputs: ", sc));
		CalculationService.numberCapture(number, sc);
		CalculationService.showResult();
		ConsoleMessageServices.printEndMessage();
		
		sc.close();
	}

}
