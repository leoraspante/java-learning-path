// Entity superclass representing a fuel.

package model.entities;

import java.time.LocalDateTime;

public abstract class Fuel {

	// Fields.
	private String refuelingId;
	private String fuelType;
	private Double liters;
	private LocalDateTime refuelingDateTime;

	// Constructor.
	public Fuel(String refuelingId, String fuelType, Double liters, LocalDateTime refuelingDateTime) {
		this.refuelingId = refuelingId;
		this.fuelType = fuelType;
		this.liters = liters;
		this.refuelingDateTime = refuelingDateTime;
	}

	// Getters and Setters.
	public String getRefuelingId() {
		return refuelingId;
	}

	public void setRefuelingId(String refuelingId) {
		this.refuelingId = refuelingId;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	

	public Double getLiters() {
		return liters;
	}

	public void setLiters(Double liters) {
		this.liters = liters;
	}

	public LocalDateTime getRefuelingDateTime() {
		return refuelingDateTime;
	}

	public void setRefuelingDateTime(LocalDateTime refuelingDateTime) {
		this.refuelingDateTime = refuelingDateTime;
	}
	
}
