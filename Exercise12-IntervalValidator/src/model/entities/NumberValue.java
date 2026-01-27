// Entity class representing a numeric value.

package model.entities;

public class NumberValue {

	// Fields.
	private Double value;

	// Constructor.
	public NumberValue(Double value) {
		this.value = value;
	}

	// Getters and Setters.
	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
}
