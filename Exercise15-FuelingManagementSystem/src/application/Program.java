/**
 * Fueling Management System
 *
 * A simple Java program that simulates a gas station fueling process.
 * It lets the user select a fuel type, enter the amount in liters,
 * and calculates the total cost of the fueling.
 */


package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.ConsoleMessages;
import model.services.RefuelingMenuService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Use dot as decimal separator.
		Scanner sc = new Scanner(System.in);
		
		ConsoleMessages.printStartMenu();
		RefuelingMenuService.printFuelingMenu(sc);
		
		sc.close();
	}

}
