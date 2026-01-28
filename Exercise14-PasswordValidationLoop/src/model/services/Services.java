// Service class responsible for mathematical calculations, validations and display messages.

package model.services;

import java.util.Scanner;

import model.utils.Utils;

public final class Services {

	// Method responsible for displaying start menu.
	public static void showMenu() {
		System.out.println("Password Validation Loop");
		System.out.println();
		System.out.println("Defalt password: (2002)");
		System.out.println("The user can set a new password.");
		System.out.println();
	}
	
	// Default password.
	private static Integer defaultPassword = 2002;
	
	// Method responsible for set a new password.
	public static Integer setNewPassword(Scanner sc) {
		while(true) {
			char userChoice = Utils.readChar("Do you want set a new password (Y/N): " , sc);
			if(userChoice == 'Y') {
				defaultPassword = Utils.readInt("Enter a new password: ", sc);
				System.out.println("Password succesfully changed!\n");
				return defaultPassword;
			}
			else if (userChoice == 'N') {
				System.out.println();
				return defaultPassword;
			}
			else {
				System.out.printf("Invalid choice, please try again.%n%n");
			}
		}
	}
	
	// Method responsible for check and validate user's password input.
	public static String checkPassword(Scanner sc) {
		int userAttempts = 0;
		int maxAttempts = 2;
		while(true) {
			int userInput = Utils.readInt("Enter the password: ", sc);
			if(userInput != defaultPassword) {
				userAttempts ++;
				System.out.printf("Invalid password atempt nº: %d, number of attempts left: %d.%n%n", userAttempts, (maxAttempts - userAttempts) + 1);	
			}
			else {
				return "\nAccess granted!\n";
			}
			if(userAttempts > maxAttempts) {
				 return"\nLogin blocked. Try again after 10 minutes.\nProgram terminated.";
			}
		}
	}
	
}
