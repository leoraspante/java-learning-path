// Description: Reads the code and quantity of a snack item and calculates the total bill.

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entites.Product;
import model.services.Services;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<Product>(Services.products);
		
		Services.showMenu();
				
		// Product data collection
		
		System.out.println(list.size());
		
		int code = Services.productCodeCapture(sc);
		
		System.out.println(code);
		
		int quantity = Utils.readInt("Enter product quantity: ", sc);

		double result = Services.productOrderCalculator(code, quantity, list);
		
		System.out.printf("Total value: $ %.2f.%n", result);
		
		sc.close();
	}

}
