// Service class responsible for displaying console messages.

package model.services;

public class ConsoleMessageService {

	// Method responsible for displaying the program start message.
	public static void printStartMessage() {
		System.out.println("==============================================================");
		System.out.println(" Welcome to the Odd Numbers Printer! ");
		System.out.println(" This program will print all odd numbers from 1 up to X. ");
		System.out.println("==============================================================");
	}

	// Method responsible for displaying the program terminating message.
	public static void printEndMessage() {
		System.out.println("==============================================================");
		System.out.println(" Program finished. Thank you for using the Odd Numbers Printer! ");
		System.out.println("==============================================================");
		System.out.println();
	}

	// Method responsible for displaying the program terminating message.
	public static void printResultMessage(Integer number) {
		System.out.println("==============================================================");
		System.out.printf(" Now displaying the odd numbers up to %d: %n", number);
		System.out.println("==============================================================");
	}

}
