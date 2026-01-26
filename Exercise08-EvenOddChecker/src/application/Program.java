// Description: Reads an integer and determines whether its even or odd.

package application;

import java.util.Scanner;

import model.entities.NumberValue;
import model.services.Services;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Services.showMenu();
		
		NumberValue number = new NumberValue(Utils.readInt("Enter a number: ", sc));
		
		String result = Services.evenOddChecker(number);
		
		System.out.printf("Result: %s%n", result);
		
		sc.close();
	}
}
