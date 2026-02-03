// Service class responsible for performing mathematical calculations.

package model.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.NumberValue;
import model.utils.InputUtils;

public class CalculationService {
	
	// List that stores numbers.
	public static List<Integer> numberList = new ArrayList<>();
	
	// Method responsible for checking values in the interval.
	public static void numberCapture(NumberValue numberValue, Scanner sc) {
		int numOfInputs = numberValue.getValue(); 
		for(int i=1; i<=numOfInputs; i++) {
			System.out.printf("Number %d:", i);
			numberList.add(InputUtils.readInt(" ", sc)); 
		}
	}
	
	// Method responsible for displaying results.
	public static void showResult() {
		int quantityIn = 0;
		int quantityOut = 0;
		ConsoleMessageServices.printResultMessage();
		for(Integer number : numberList) {
			if(number >= 10 && number <= 20) {
				quantityIn += 1;
			}
			else {
				quantityOut += 1;
			}
		}
		System.out.printf("Values in the range [10,20]: %d%n", quantityIn);
		System.out.printf("Values outside the range [10,20]: %d%n", quantityOut);
	}
	
	
}
