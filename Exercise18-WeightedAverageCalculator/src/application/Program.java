// Description: This program calculates the weighted average of three numbers using fixed weights.

package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.NumberValue;
import model.services.CalculationServices;
import model.services.ConsoleMessageServices;
import model.utils.InputUtils;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ConsoleMessageServices.printStartMessage();
		NumberValue quantityOfInputs = new NumberValue(InputUtils.readInt("Enter the number of calculations do you want to perform: ", sc));
		CalculationServices.numberCapture(quantityOfInputs, sc);
		CalculationServices.showResult();
		ConsoleMessageServices.printEndMessage();
		sc.close();
	}

}
