// Utility class responsible for read/validate user's input. 

package model.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {

	// Method dedicated for read and validate double values.
	public static Double readValue(String msg, Scanner sc) {
		double minValue = 0.0; // Here you can change the minimum value acceptable.
		while(true) {
			try {
				System.out.print(msg);
				double value =sc.nextDouble();
				if(value<minValue) {
					System.out.printf("Invalid value, please try again.%n%n");
				}
				else {
					return value;
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("Only numeric values are acceptable, please try again.%n%n");
				sc.nextLine();
			}
		}
	}
	
}
