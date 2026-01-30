// Entity class responsible for representing a numeric value.

package model.entities;

public class NumberValue {

	// Fields.
	private Integer value;

	// Constructors.
	public NumberValue(Integer value) {
		this.value = value;
	}

	// Getters and Setters.
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}
