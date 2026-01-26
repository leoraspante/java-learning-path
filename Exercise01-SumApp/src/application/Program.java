// Description: Reads two values and prints their sum.

package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.NumberValue;
import model.services.Calculation;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Use dot as decimal separator.
		Scanner sc = new Scanner(System.in);
		
		Utils.simpleMenu();
		
		NumberValue n1 = new NumberValue(Utils.readDouble("Enter first value: ", sc));
		NumberValue n2 = new NumberValue(Utils.readDouble("Enter second value: ", sc));
		
		double result = Calculation.sumCalculator(n1, n2);
		
		System.out.printf("The sum between the values are: %.2f%n", result);
		
		sc.close();
	}
}
