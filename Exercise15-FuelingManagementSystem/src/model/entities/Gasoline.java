package model.entities;

import java.time.LocalDateTime;

import model.services.RefuelingService;

public class Gasoline extends Fuel {

	// Fields.
	private Double pricePerLitre;

	// Constructor.
	public Gasoline(String refuelingId, String fuelType, Double pricePerLitre, Double liters,
			LocalDateTime refuelingDateTime) {
		super(refuelingId, fuelType, liters, refuelingDateTime);
		this.pricePerLitre = pricePerLitre;
	}

	// Getters and Setters.
	public Double getPricePerLitre() {
		return pricePerLitre;
	}

	public void setPricePerLitre(Double pricePerLitre) {
		this.pricePerLitre = pricePerLitre;
	}

	// Methods.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Refueling ID: ").append(getRefuelingId()).append(" | Total: ")
				.append(String.format("%.2f", getLiters() * getPricePerLitre())).append(System.lineSeparator());
		sb.append("Date/Time: ").append(getRefuelingDateTime().format(RefuelingService.dateFormat)).append(" | Fuel: ")
				.append(getFuelType()).append(" | Liters: ").append(String.format("%.2f", getLiters()))
				.append(" | Price/L: ").append(String.format("%.2f", getPricePerLitre()))
				.append(System.lineSeparator());
		return sb.toString();
	}

}
