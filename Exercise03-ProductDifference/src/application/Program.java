// Description: Computes the difference between two products (AxB - CxD).

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
		NumberValue n3 = new NumberValue(Utils.readDouble("Enter third value: ", sc));
		NumberValue n4 = new NumberValue(Utils.readDouble("Enter fourth value: ", sc));
		
		double result = Calculation.calculateDifference(n1, n2, n3, n4);
		
		System.out.printf("Difference between products: %.2f%n", result);
		
		sc.close();
	}
}
