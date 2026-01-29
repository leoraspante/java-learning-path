// Service class responsible for reading and registering refueling data.

package model.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import model.entities.Alcohol;
import model.entities.Diesel;
import model.entities.Fuel;
import model.entities.Gasoline;
import model.utils.Utils;

public final class RefuelingService {
	
	// Global standard date-time format.
	public static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	// Global public static list for storing all fuel types
	public static final List<Fuel> refuelingData = new ArrayList<>();
	
	// Method responsible for storing fuel values.
	public static final double GASOLINE_VALUE = 6.32;
	public static final double DIESEL_VALUE = 6.05;
	public static final double ALCOHOL_VALUE = 4.57;

	// Method responsible for gasoline fuel registrations..
	public static void processGasolineData(Scanner sc) {
		ConsoleMessages.printGasolineRefuelingTitle();
		String refuelingId = UUID.randomUUID().toString();
		String fuelType = "GASOLINE";
		LocalDateTime refuelingDateTime = Utils.readDataTime("Enter refueling date and time: ", sc, dateFormat);
		double liters = Utils.readDouble("Enter the amount of liters: ", sc);
		Gasoline gasolineRecord = new Gasoline(refuelingId, fuelType, GASOLINE_VALUE, liters, refuelingDateTime);
		refuelingData.add(gasolineRecord);
		System.out.println("Refueling successfully recorded.\n");
	}

	// Method responsible for diesel fuel registrations.
	public static void processDieselData(Scanner sc) {
		ConsoleMessages.printDieselRefuelingTitle();
		String refuelingId = UUID.randomUUID().toString();
		String fuelType = "DIESEL";
		LocalDateTime refuelingDateTime = Utils.readDataTime("Enter refueling date and time: ", sc, dateFormat);
		double liters = Utils.readDouble("Enter the amount of liters: ", sc);
		Diesel dieselRecord = new Diesel(refuelingId, fuelType, DIESEL_VALUE, liters, refuelingDateTime);
		refuelingData.add(dieselRecord);
		System.out.println("Refueling successfully recorded.\n");
	}

	// Method responsible for Alcohol fuel registrations.
	public static void processAlcoholData(Scanner sc) {
		ConsoleMessages.printAlcoholRefuelingTitle();
		String refuelingId = UUID.randomUUID().toString();
		String fuelType = "ALCOHOL";
		LocalDateTime refuelingDateTime = Utils.readDataTime("Enter refueling date and time (dd/MM/yyyy HH:mm): ", sc, dateFormat);
		double liters = Utils.readDouble("Enter the amount of liters: ", sc);
		Alcohol alcoholRecord = new Alcohol(refuelingId, fuelType, ALCOHOL_VALUE, liters, refuelingDateTime);
		refuelingData.add(alcoholRecord);
		System.out.println("Refueling successfully recorded.\n");
	}
	
}
