// Utility class responsible for read/validate user's input.

package model.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {

	// Method responsible for read and validate salary value.
	public static Double readSalary(Scanner sc) {
		double minSalaryValue = 0.0; // here you can set the minimum salary value.
		while(true) {
			try {
				System.out.print("Enter salary value: ");
				double value = sc.nextDouble();
				if(value < minSalaryValue) {
					System.out.printf("Invalid value, please try again with a higher value.%n%n");
				}
				else {
					return value;
				}
			}
			catch(InputMismatchException e){
				System.out.printf("Only numeric values are acceptable, please try again.%n%n");
				sc.nextLine();
			}
		}
	}
	
}
