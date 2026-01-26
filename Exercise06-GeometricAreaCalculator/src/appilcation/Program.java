// Description: Calculates areas of triangle, circle, trapezoid, square and rectangle.

package appilcation;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Shape;
import model.services.Services;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Use dot as decimal separator.
		Scanner sc = new Scanner(System.in);

		Services.showMenu();

		double valueA = Utils.readValue("Enter A value: ", sc);
		double valueB = Utils.readValue("Enter B value: ", sc);
		double valueC = Utils.readValue("Enter C value: ", sc);
		System.out.println();

		Shape shape = new Shape(valueA, valueB, valueC);

		double triangleArea = Services.triangleAreaCalculator(shape);
		System.out.printf("Triagle area: %.3f%n", triangleArea);

		double circleArea = Services.circleAreaCalculator(shape);
		System.out.printf("Circle area: %.3f%n", circleArea);
		
		double trapezoidArea = Services.trapezoidAreaCalculator(shape);
		System.out.printf("Trapezoid area: %.3f%n", trapezoidArea);
		
		double squareArea = Services.squareAreaCalculator(shape);
		System.out.printf("Square area: %.3f%n", squareArea);

		double rectangleArea = Services.rectangleAreaCalculator(shape);
		System.out.printf("Rectangle area: %.3f%n", rectangleArea);
		
		sc.close();
	}
}
