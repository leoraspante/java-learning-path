// Service class resposible for displaying console messages.

package model.services;

public final class ConsoleMessageServices {

	// Method responsible for displaying system's start message.
	public static void printStartMessage() {
		System.out.println("==============================================================");
		System.out.println(" Welcome to the Interval Analyzer! ");
		System.out.println(" This program will check how many numbers fall within [10, 20]. ");
		System.out.println(" Let's get started and analyze your inputs! ");
		System.out.println("==============================================================");
	}

	// Method responsible for displaying system's termination message.
	public static void printEndMessage() {
		System.out.println("==============================================================");
		System.out.println(" Analysis complete. Thank you for using the Interval Analyzer!");
		System.out.println("==============================================================");
	}

	// Method responsible for displaying system's result message.
	public static void printResultMessage() {
		System.out.println("--------------------------------------------------------------");
		System.out.println(" Analyzing your inputs... Results:                            ");
		System.out.println("--------------------------------------------------------------");
	}

}
