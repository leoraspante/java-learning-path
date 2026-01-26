// Utility class responsible for performing calculations.

package model.services;

import model.entities.NumberValue;

public final class Calculation {

	// Method dedicated to calculating the difference between products.
	public static Double calculateDifference(NumberValue n1, NumberValue n2, NumberValue n3, NumberValue n4) {
		return ((n1.getValue()*n2.getValue()) - (n3.getValue()*n4.getValue()));
	}
}