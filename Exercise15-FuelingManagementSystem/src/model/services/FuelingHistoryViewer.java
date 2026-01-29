package model.services;

import java.util.List;

import model.entities.Fuel;

public final class FuelingHistoryViewer {

	// Copy of refueling data for queries.
	public static List<Fuel> refuelingRecords = RefuelingService.refuelingData;

	// Method responsible for displaying all refueling data.
	public static void printAllRefuelingData(List<Fuel> refuelingRecords) {
		if (refuelingRecords.size() == 0) {
			ConsoleMessages.printNoRefuelingRecordsTitle();
		} else {
			ConsoleMessages.printRefuelingRecordsTitle();
			for (Fuel items : refuelingRecords) {
				System.out.println(items);
			}
		}
	}

	// Method responsible for displaying Gasoline refueling data.
	public static void printGasolineRefuelingData(List<Fuel> refuelingRecords) {
		double totalLiters = 0.0;
		int refuelingCount = 0;
		if (refuelingRecords.size() == 0) {
			ConsoleMessages.printNoRefuelingRecordsTitle();
		} else {
			ConsoleMessages.printGasolineRecordsTitle();
			for (Fuel items : refuelingRecords) {
				if(items.getFuelType().equalsIgnoreCase("GASOLINE")) {
					System.out.println(items);
					System.out.println();
					refuelingCount += 1;
					totalLiters += items.getLiters();
				}
			}
			System.out.printf("Total Gasoline Refueling Count: %d.%n",refuelingCount);
			System.out.printf("Total Gasoline Refueled Value: %.2f.%n",totalLiters * RefuelingService.GASOLINE_VALUE);
			System.out.printf("Total Gasoline Refueled Volume: %.2f.%n",totalLiters);
		}
	}

	// Method responsible for displaying Diesel refueling data.
	public static void printDieselRefuelingData(List<Fuel> refuelingRecords) {
		double totalLiters = 0.0;
		int refuelingCount = 0;
		if (refuelingRecords.size() == 0) {
			ConsoleMessages.printNoRefuelingRecordsTitle();
		} else {
			ConsoleMessages.printDieselRecordsTitle();
			for(Fuel items : refuelingRecords) {
				if(items.getFuelType().equalsIgnoreCase("DIESEL")) {
					System.out.println(items);
					System.out.println();
					refuelingCount += 1;
					totalLiters += items.getLiters();	
				}
			}
		}
		System.out.printf("Total Diesel Refueling Count: %d.%n",refuelingCount);
		System.out.printf("Total Diesel Refueled Value: %.2f.%n",totalLiters * RefuelingService.DIESEL_VALUE);
		System.out.printf("Total Diesel Refueled Volume: %.2f.%n",totalLiters);
	}

	// Method responsible for displaying Alcohol refueling data.
	public static void printAlcoholRefuelingData(List<Fuel> refuelingRecords) {
		double totalLiters = 0.0;
		int refuelingCount = 0;
		if (refuelingRecords.size() == 0) {
			ConsoleMessages.printNoRefuelingRecordsTitle();
		} else {
			ConsoleMessages.printAlcoholRecordsTitle();
			for(Fuel items : refuelingRecords) {
				if(items.getFuelType().equalsIgnoreCase("ALCOHOL")) {
					System.out.println(items);
					System.out.println();
					refuelingCount += 1;
					totalLiters += items.getLiters();
				}
			}
		}
		System.out.printf("Total Alcohol Refueling Count: %d.%n",refuelingCount);
		System.out.printf("Total Alcohol Refueled Value: %.2f.%n",totalLiters * RefuelingService.ALCOHOL_VALUE);
		System.out.printf("Total Alcohol Refueled Volume: %.2f.%n",totalLiters);
	}

}
