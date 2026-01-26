// Utility class responsible for executing mathematical and computational calculations.

package model.services;

import model.entities.NumberValue;

public final class Calculation {

	// Method dedicated to perform the sum of the values.
	public static Double sumCalculator(NumberValue n1, NumberValue n2) {
		return n1.getValue() + n2.getValue();
	}
}
