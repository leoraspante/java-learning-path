// Entity class representing a numeric value.

package model.entities;

public class NumberValue {

	// Fields.
	private Integer inputQuantity;
	private Double values;

	// Constructor.
	public NumberValue(Integer inputQuantity) {
		this.inputQuantity = inputQuantity;
	}
	
	public NumberValue(Double values) {
		this.values = values;
	}

	// Getters.
	public Integer getInputQuantity() {
		return inputQuantity;
	}
	
	public Double getValues() {
		return values;
	}

}
