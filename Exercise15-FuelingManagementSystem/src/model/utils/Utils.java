// Utility class responsible for read/validate user's input.

package model.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {

	// Method responsible for read and validate integer values.
	public static Integer readInt(String msg, Scanner sc) {
		while (true) {
			try {
				System.out.print(msg);
				int value = sc.nextInt();
				sc.nextLine();
				return value;
			} catch (InputMismatchException e) {
				System.out.printf("Only numeric integer values are acceptable, please try again.%n%n");
				sc.nextLine();
			}
		}
	}

	// Method responsible for read and validate double values.
	public static Double readDouble(String msg, Scanner sc) {
		while (true) {
			try {
				System.out.print(msg);
				double value = sc.nextDouble();
				sc.nextLine();
				return value;
			} catch (InputMismatchException e) {
				System.out.printf("Only numeric values are acceptable, please try again.%n%n");
				sc.nextLine();
			}
		}
	}

	// Method responsible for read and validate data/time values.
	public static LocalDateTime readDataTime(String msg, Scanner sc, DateTimeFormatter fmt) {
		while (true) {
			try {
				System.out.print(msg);
				LocalDateTime value = LocalDateTime.parse(sc.nextLine().trim(), fmt);
				return value;
			} catch (DateTimeParseException e) {
				System.out.printf(
						"Invalid Data-Time format, please try again using the correct pattern (dd/MM/yyyy HH:mm).%n%n");
			}
		}
	}

	// Method responsible for read and validate char values.
	public static Character readChar(String msg, Scanner sc) {
		while (true) {
			System.out.print(msg);
			char value = sc.nextLine().trim().toUpperCase().charAt(0);
			return value;
		}
	}

}
