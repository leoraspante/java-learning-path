// Description: Reads a numeric value and determines which interval it belongs to: [0,25], (25,50], (50,75], (75,100], or prints “Out of interval.”

package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.NumberValue;
import model.services.Services;
import model.utils.Utils;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US); // Use dot as decimal separator.
		Scanner sc = new Scanner(System.in);
		
		Services.showMenu();
		
		NumberValue number = new NumberValue(Utils.readDouble("Enter a value: ", sc));
		
		System.out.printf("Result: %s.%n", Services.intervalChecker(number));
		
		sc.close();
	} 
}
