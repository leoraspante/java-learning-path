// Service class designated for performing mathematical calculations and display console messages.

package model.services;

import model.entities.NumberValue;

public final class Services {
	
	// Method for display the main menu.
	public static void showMenu() {
		System.out.println("Game Duration Calculator");
		System.out.println();
		System.out.println("Time format: 24 Hours.");
		System.out.println();
	}

	// Method for performing mathematical calculations.
	public static Integer calculateTime(NumberValue value) {
		int startTime = value.getStartTime();
		int finishTime = value.getFinishTime();
		
		if(startTime > finishTime) {
			return (24 - startTime) + finishTime;
		}
		else if(startTime == finishTime) {
			return 24;
		}
		else {
			return finishTime - startTime;
		}
	}
	
}
