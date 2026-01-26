// Description: Reads two integers and checks if they are multiples of each other.

package application;

import java.util.Scanner;

import model.entities.NumberValue;
import model.services.Services;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Services.showMenu();
		
		int firstValue = Utils.readInt("Enter first value: ", sc);
		int secondValue = Utils.readInt("Enter second value: ", sc);		
		
		NumberValue number = new NumberValue(firstValue, secondValue);

		String result = Services.multipleChecker(number);
		
		System.out.printf("Result %s%n", result);
		
		sc.close();
	}
}
