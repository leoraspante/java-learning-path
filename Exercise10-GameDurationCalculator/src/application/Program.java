// Description: Reads the start and end times of a game and calculates its duration (1-24 hours).

package application;

import java.util.Scanner;

import model.entities.NumberValue;
import model.services.Services;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Services.showMenu();

		NumberValue number = new NumberValue(Utils.readInt("Enter game start time: ", sc), Utils.readInt("Enter game end time: ", sc));
		
		int result = Services.calculateTime(number);
		
		System.out.printf("Total game duration in hours: %d.%n", result);
		
		sc.close();
	}
}
