// Service class that centralizes console message displays.

package model.services;

public final class ConsoleMessages {

	// Method responsible for displaying the system's start menu.
	public static void printStartMenu() {
		System.out.println("=============================================================================================");
		System.out.println("                                   Fueling Management System                                 ");
		System.out.println("=============================================================================================");
		System.out.println();
		System.out.println("This system allows you to:");
		System.out.println("- Record each refueling with liters, value, and date/time");
		System.out.println("- Track the number of reueling per fuel type");
		System.out.println("- View detailed fueling history and totals");
		System.out.println("=============================================================================================");
	}

	// Method responsible for displaying the fueling options menu.
	public static void printFuelingOptions() {
		System.out.println();
		System.out.println("=============================================================================================");
		System.out.println("                                       Available Options:                                    ");
		System.out.println("=============================================================================================");
		System.out.println("[1] Refuel Alcohol");
		System.out.println("[2] Refuel Gasoline");
		System.out.println("[3] Refuel Diesel");
		System.out.println("[4] View Refueling Reports");
		System.out.println("[5] End Program");
		System.out.println("=============================================================================================");
	}
	
	// Method responsible for displaying the refueling report submenu.
	public static void printReportMenu() {
		System.out.println();
		System.out.println("=============================================================================================");
		System.out.println("                              Refueling Reports Options                                      ");
		System.out.println("=============================================================================================");
		System.out.println("[1] View All Refueling Records (Combined)");
		System.out.println("[2] View Alcohol Refueling Records");
		System.out.println("[3] View Gasoline Refueling Records");
		System.out.println("[4] View Diesel Refueling Records");
		System.out.println("[5] Back to Main Menu");
		System.out.println("=============================================================================================");
		System.out.println();
	}

	// Method responsible for displaying Diesel refueling records title.
	public static void printDieselRecordsTitle() {
		System.out.println();
		System.out.println("=============================================================================================");
		System.out.println("                              Diesel Refueling Records                                       ");
		System.out.println("=============================================================================================");
		System.out.println();
	}
	
	// Method responsible for displaying Gasoline refueling records title.
	public static void printGasolineRecordsTitle() {
		System.out.println();
		System.out.println("=============================================================================================");
		System.out.println("                              Gasoline Refueling Records                                     ");
		System.out.println("=============================================================================================");
		System.out.println();
	}
	
	// Method responsible for displaying Alcohol refueling records title.
	public static void printAlcoholRecordsTitle() {
		System.out.println();
		System.out.println("=============================================================================================");
		System.out.println("                              Alcohol Refueling Records                                      ");
		System.out.println("=============================================================================================");
		System.out.println();
	}
	
	// Method responsible for displaying the Gasoline refueling system title.
	public static void printGasolineRefuelingTitle() {
		System.out.println();
		System.out.println("=============================================================================================");
		System.out.println("                                   Gasoline Refueling System                                 ");
		System.out.println("=============================================================================================");
		System.out.println();
	}

	// Method responsible for displaying the Alcohol refueling system title.
	public static void printAlcoholRefuelingTitle() {
		System.out.println();
		System.out.println("=============================================================================================");
		System.out.println("                                   Alcohol Refueling System                                  ");
		System.out.println("=============================================================================================");
		System.out.println();
	}

	// Method responsible for displaying the Diesel refueling system title.
	public static void printDieselRefuelingTitle() {
		System.out.println();
		System.out.println("=============================================================================================");
		System.out.println("                                    Diesel Refueling System                    ");
		System.out.println("=============================================================================================");
		System.out.println();
	}

	// Method responsible for displaying the refueling records report title.
	public static void printRefuelingRecordsTitle() {
		System.out.println();
		System.out.println("=============================================================================================");
		System.out.println("                                    Refueling Records Report                   ");
		System.out.println("=============================================================================================");
		System.out.println();
	}

	// Method responsible for displaying the message when no refueling records are found.
	public static void printNoRefuelingRecordsTitle() {
		System.out.println();
		System.out.println("=============================================================================================");
		System.out.println("                                   No Refueling Records Found                  ");
		System.out.println("=============================================================================================");
		System.out.println();
	}

	// Method responsible for displaying the program termination message.
	public static void printEndMenu() {
		System.out.println();
		System.out.println("=============================================================================================");
		System.out.println("                          Program Terminated Successfully                                    ");
		System.out.println("=============================================================================================");
		System.out.println("                         Thank you for using the system!                                     ");
		System.out.println("=============================================================================================");
		System.out.println();
	}

}
