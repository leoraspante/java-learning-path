// Description: Repeatedly asks for a numeric password until the correct one (user choice) is entered.

package application;

import java.util.Scanner;

import model.services.Services;

public class Program {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
				
		Services.showMenu();
		
		Services.setNewPassword(sc);
		
		String passwordChecker = Services.checkPassword(sc);
		System.out.println(passwordChecker);
		
		sc.close();
	}

}
