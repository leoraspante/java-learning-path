// Description: Reads an integer and prints whether the number is negative or not.

package application;

import java.util.Scanner;

import model.entities.NumberValue;
import model.services.Services;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Services.showMenu();
			
		NumberValue n1 = new NumberValue(Utils.readInt("Enter the value: ", sc));
		
		String result = Services.checkNegative(n1);
		
		System.out.printf("Result: %s%n", result);
		
		sc.close();
	}
}
