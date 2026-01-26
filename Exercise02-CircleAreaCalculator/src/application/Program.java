// Description: Calculates the area of a circle given its radius.

package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Circle;
import model.services.Calculation;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Use dot as decimal separator.
		Scanner sc = new Scanner(System.in);
		
		Utils.simpleMenu();
		
		Circle c1 = new Circle(Utils.readDouble("Enter radius value: ", sc));
		
		double result = Calculation.calculateArea(c1);
		
		System.out.printf("Total area: %.4f%n", result);
		
		sc.close();
	}
}
