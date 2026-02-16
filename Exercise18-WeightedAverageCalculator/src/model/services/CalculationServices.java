// Service class responsible for performing mathematical calculations.

package model.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.NumberValue;
import model.utils.InputUtils;

public class CalculationServices {
	
	// List that stores numbers.
	public static List<Double> numberList = new ArrayList<>();
	
	// Method responsible for checking values in the interval.
	public static void numberCapture(NumberValue inputQuantity, Scanner sc) {
		int numOfInputs = inputQuantity.getInputQuantity(); 
		for(int i=1; i<=numOfInputs; i++) {
			System.out.printf("Sequence number %d:%n", i);
			for(int j=1; j<=3; j++) {
				System.out.printf("%dº number:",j);
				numberList.add(InputUtils.readDouble(" ", sc));
			}
			System.out.println();
		}
	}
	
	// Method responsible for displaying results.
	public static void showResult() {
		ConsoleMessageServices.printResultMessage();
		int sequenceSize = 3;
		int [] weights = {2, 3, 5};
		int sumOfWeights = 10;
		
		for(int i=0; i<numberList.size(); i+=sequenceSize) {
			double result = 0;
			
			for(int j=0; j<sequenceSize; j++) {
				result += numberList.get(i+j) * weights[j];
			}
			
			double average = result/sumOfWeights;
			int sequenceNumber = (i/sequenceSize)+1;
			System.out.printf(" Sequence %d - Weighted average = %.2f%n", sequenceNumber, average);
		}
	}

	
}
