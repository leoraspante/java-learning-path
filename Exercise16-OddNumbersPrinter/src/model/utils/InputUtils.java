// Utility class responsible for read/validate user's input.

package model.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class InputUtils {

	// Method responsible for read/validate integer values.
	public static Integer readInt(String msg, Scanner sc) {
		while (true) {
			try {
				System.out.print(msg);
				int value = sc.nextInt();
				sc.nextLine();
				return value;
			} catch (InputMismatchException e) {
				System.out.printf("Only numeric integer value are acceptable, please try again.%n%n");
				sc.nextLine();
			}
		}
	}
}
