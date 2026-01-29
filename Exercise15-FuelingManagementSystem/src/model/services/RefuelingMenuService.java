package model.services;

import java.util.Scanner;

import model.utils.Utils;

public final class RefuelingMenuService {
	
	// Method responsible for displaying the fuel menu and handles user choices.
	public static void printFuelingMenu(Scanner sc) {
		while (true) {
			ConsoleMessages.printFuelingOptions();
			switch (Utils.readInt("Choose an option: ", sc)) {
			case 1:
				RefuelingService.processAlcoholData(sc);
				anotherAlcoholRefueling(sc);
				break;
			case 2:
				RefuelingService.processGasolineData(sc);
				anotherGasolineRefueling(sc);
				break;
			case 3:
				RefuelingService.processDieselData(sc);
				anotherDieselRefueling(sc);
				break;
			case 4:
				printFuelingReportMenu(sc);
				break;
			case 5:
				ConsoleMessages.printEndMenu();
				return;
			default:
				System.out.println("Invalid option, please try again.");

			}
		}
	}
	
	// Method responsible for displaying the refueling report submenu and processing user selections.
	public static void printFuelingReportMenu(Scanner sc) {
		while (true) {
			ConsoleMessages.printReportMenu();
			switch (Utils.readInt("Choose an option: ", sc)) {
			case 1:
				FuelingHistoryViewer.printAllRefuelingData(FuelingHistoryViewer.refuelingRecords);
				break;
			case 2:
				FuelingHistoryViewer.printAlcoholRefuelingData(FuelingHistoryViewer.refuelingRecords);
				break;
			case 3:
				FuelingHistoryViewer.printGasolineRefuelingData(FuelingHistoryViewer.refuelingRecords);
				break;
			case 4:
				FuelingHistoryViewer.printDieselRefuelingData(FuelingHistoryViewer.refuelingRecords);
				break;
			case 5:
				return;
			default:
				System.out.println("Invalid option, please try again.");

			}
		}
	}

	// Method responsible for enabling gasoline refueling repetition.
	public static void anotherGasolineRefueling(Scanner sc) {
		while (true) {
			char userChoice = Utils.readChar("Would you like to register another gasoline refueling? (Y/N): ", sc);
			if (userChoice == 'Y') {
				RefuelingService.processGasolineData(sc);
			} else if (userChoice == 'N') {
				break;
			} else {
				System.out.printf("Invalid choice, please try again.%n%n");
			}
		}
	}

	// Method responsible for enabling alcohol refueling repetition.
	public static void anotherAlcoholRefueling(Scanner sc) {
		while (true) {
			char userChoice = Utils.readChar("Would you like to register another alcohol refueling? (Y/N): ", sc);
			if (userChoice == 'Y') {
				RefuelingService.processAlcoholData(sc);
			} else if (userChoice == 'N') {
				break;
			} else {
				System.out.printf("Invalid choice, please try again.%n%n");
			}
		}
	}

	// Method responsible for enabling diesel refueling repetition.
	public static void anotherDieselRefueling(Scanner sc) {
		while (true) {
			char userChoice = Utils.readChar("Would you like to register another diesel refueling? (Y/N): ", sc);
			if (userChoice == 'Y') {
				RefuelingService.processDieselData(sc);
			} else if (userChoice == 'N') {
				break;
			} else {
				System.out.printf("Invalid choice, please try again.%n%n");
			}
		}
	}
	
}
