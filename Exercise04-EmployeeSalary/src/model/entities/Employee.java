// Entity class representing an employee.

package model.entities;

public class Employee {

	// Fields.
	private String name;
	private Double valuePerHour;
	private Double workedHours;
	
	// Constructor.
	public Employee(String name, Double valuePerHour, Double workedHours) {
		this.name = name;
		this.valuePerHour = valuePerHour;
		this.workedHours = workedHours;
	}

	// Getters and Setters.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Double getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(Double workedHours) {
		this.workedHours = workedHours;
	}
	
}
