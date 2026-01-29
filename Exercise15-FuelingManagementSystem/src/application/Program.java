// Description: Records fuel choices (1=Alcohol, 2=Gasoline, 3=Diesel) until code 4 ends input.

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
