// entity class representing a numerical value.

package model.entities;

public class NumberValue {

	// Fields.
	private Integer firstValue;
	private Integer secondValue;
	
	// Constructor.
	public NumberValue(Integer firstValue, Integer secondValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
	}

	// Getters and Setters.
	public Integer getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(Integer firstValue) {
		this.firstValue = firstValue;
	}

	public Integer getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(Integer secondValue) {
		this.secondValue = secondValue;
	}
	
}
