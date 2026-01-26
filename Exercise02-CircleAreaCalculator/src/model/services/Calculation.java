package model.services;

import model.entities.Circle;

public final class Calculation {

	// Method dedicated for calculate the area of an circle.
	public static Double calculateArea(Circle area) {
		return Math.PI * (Math.pow(area.getRadius(), 2));
	}
}
