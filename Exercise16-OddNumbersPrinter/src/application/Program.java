// Description: Reads an integer X and prints all odd numbers from 1 up to X.

package application;

import java.util.Scanner;

import model.entities.NumberValue;
import model.services.CalculationService;
import model.services.ConsoleMessageService;
import model.utils.InputUtils;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ConsoleMessageService.printStartMessage();
		NumberValue number = new NumberValue(InputUtils.readInt("Enter a value: ", sc));
		CalculationService.oddChecker(number);
		

		
		sc.close();
	}

}
