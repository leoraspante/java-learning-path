package model.entities;

public class Shape {
	
	// Fields.
	private double valueA;
	private double valueB;
	private double valueC;
	
	// Constructor.
	public Shape(double valueA, double valueB, double valueC) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.valueC = valueC;
	}

	// Getters and Setters.
	public double getValueA() {
		return valueA;
	}

	public void setValueA(double valueA) {
		this.valueA = valueA;
	}

	public double getValueB() {
		return valueB;
	}

	public void setValueB(double valueB) {
		this.valueB = valueB;
	}

	public double getValueC() {
		return valueC;
	}

	public void setValueC(double valueC) {
		this.valueC = valueC;
	}
}
