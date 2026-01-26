// Description Computes the total payment for two purchased items.

package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;
import model.services.Calculation;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Use dot as decimal separator.
		Scanner sc = new Scanner(System.in);

		Utils.showMenu();

		int totalProducts = Utils.readInt("How many products you are going to buy: ", sc);
		System.out.println();
		
		List<Product> products = Calculation.productRegistration(sc, totalProducts);
				
		double result = Calculation.productTotalValue(products);
		
		System.out.printf("Total value of listed products: $ %.2f%n", result);
		
		sc.close();
	}
}
