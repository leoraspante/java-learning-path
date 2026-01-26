// Service class responsible for perform mathematical calculations and display main menu.

package model.services;

import model.entities.Shape;

public final class Services {

	// Method responsible for display main menu.
	public static void showMenu() {
		System.out.println("Geometric Areas Calculator");
		System.out.println();
		System.out.println("This program will compute the areas of:");
		System.out.println("- A right triangle");
		System.out.println("- A circle");
		System.out.println("- A trapezoid");
		System.out.println("- A square");
		System.out.println("- A rectangle");
		System.out.println("======================================================");
		System.out.println("Calculation Rules");
		System.out.println();
		System.out.println("Right Triangle: area = (A * C) / 2");
		System.out.println("Circle:         area = π * C²");
		System.out.println("Trapezoid:      area = ((A + B) * C) / 2");
		System.out.println("Square:         area = B²");
		System.out.println("Rectangle:      area = A * B");
		System.out.println("======================================================");
		System.out.println("Please enter the values A,B and C to begin.");
		System.out.println();
	}
	
	// Method responsible for calculating the area of a triangle.
	public static Double triangleAreaCalculator(Shape shape) {
		double valueA = shape.getValueA();
		double valueC = shape.getValueC();
		double area = (valueA * valueC) / 2;
		return area;		
	}
	
	// Method responsible for calculating the area of a circle.
	public static Double circleAreaCalculator(Shape shape) {
		double valueC = shape.getValueC();
		double area = Math.PI * (Math.pow(valueC, 2));
		return area;
	}
	
	// Method responsible for calculating the area of a trapezoid.
	public static Double trapezoidAreaCalculator(Shape shape) {
		double valueA = shape.getValueA();
		double valueB = shape.getValueB();
		double valueC = shape.getValueC();
		double area = ((valueA + valueB) * valueC) / 2;
		return area;
	}
	
	// Method responsible for calculating the area of a square.
	public static Double squareAreaCalculator(Shape shape) {
		double valueB = shape.getValueB();
		double area = Math.pow(valueB, 2);
		return area;
	}
	
	// Method responsible for calculating the area of a rectangle.
	public static Double rectangleAreaCalculator(Shape shape) {
		double valueA = shape.getValueA();
		double valueB = shape.getValueB();
		double area = valueA * valueB;
		return area;
	}
	
}

