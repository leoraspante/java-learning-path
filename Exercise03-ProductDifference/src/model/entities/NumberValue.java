// Entity class representing a numeric value.

package model.entities;

public class NumberValue {
	
	// Fields.
	private double value;

	// Constructor.
	public NumberValue(double value) {
		this.value = value;
	}

	// Getters and Setters.
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
