// Service class resposible for displaying console messages.

package model.services;

public final class ConsoleMessageServices {

	// Method responsible for displaying system's start message.
	public static void printStartMessage() {
		System.out.println("============================================================================================");
		System.out.println(" Welcome to the Weighted Average Calculator! ");
		System.out.println(" This program calculates the weighted average of three numbers using fixed weights. ");
		System.out.println(" First number weight: 2 ");
		System.out.println(" Second number weight: 3 ");
		System.out.println(" Third number weight: 5 ");
		System.out.println("============================================================================================");
	}

	// Method responsible for displaying system's termination message.
	public static void printEndMessage() {
		System.out.println("============================================================================================");
		System.out.println(" Program terminated. Thank you for using the Weighted Average Calculator!");
		System.out.println("============================================================================================");
	}

	// Method responsible for displaying system's result message.
	public static void printResultMessage() {
		System.out.println("============================================================================================");
		System.out.println(" Analyzing your inputs... Results:                            ");
		System.out.println("============================================================================================");
	}

}
