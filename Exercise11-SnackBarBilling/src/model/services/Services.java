// Service class responsible for performing mathematical calculations and display menu.

package model.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.entites.Product;
import model.utils.Utils;

public final class Services {

	// List storing the products registered for sale.
	public static List<Product> products = new ArrayList<>(
			Arrays.asList(
					new Product(1, "Hot Dog", 4.00),
					new Product(2, "X-Salad", 4.50),
					new Product(3, "X-Bacon", 5.00),
					new Product(4, "Simple Toast", 2.00),
					new Product(5, "Soft Drink", 1.50)
			)
	);
					
	// Method responsible for displaying start menu.
	public static void showMenu() {
		System.out.println("===========Snack Bar Billing=============");
		System.out.println();
		System.out.println("+--------+---------------------+--------+");
		System.out.println("| CODE   | SPECIFICATION       | PRICE  |");
		System.out.println("+--------+---------------------+--------+");
		System.out.println("| 1      | Hot Dog             |  $ 4.00|");
		System.out.println("| 2      | X-Salad             |  $ 4.50|");
		System.out.println("| 3      | X-Bacon             |  $ 5.00|");
		System.out.println("| 4      | Simple Toast        |  $ 2.00|");
		System.out.println("| 5      | Soft Drink          |  $ 1.50|");
		System.out.println("+--------+---------------------+--------+");
		System.out.println();
	}


	// Method responsible for capture product code.
	public static Integer productCodeCapture(Scanner sc) {
		List<Product> list = new ArrayList<>(products);
		
		while (true) {
			int code = Utils.readInt("Enter product code: ", sc);
			
			if ((code -1) < list.size() || (code) > list.size()) {
				System.out.printf("Invalid product code, please try again.%n%n");
			} 
			else {
				return code -1; // -1 To be compatible with list index.
			}
		}
	}

	// Method that calculates the total order value.
	public static Double productOrderCalculator(Integer productCode, Integer productQuantity, List<Product> products) {
				
		Product product = new Product(
				products.get(productCode).getId(), 
				products.get(productCode).getName(), 
				products.get(productCode).getPrice());
		
		return product.getPrice() * productQuantity;
	}
}
