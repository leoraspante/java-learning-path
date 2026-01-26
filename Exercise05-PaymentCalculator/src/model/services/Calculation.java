// Service class designed for performing mathematical calculations.

package model.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;
import model.utils.Utils;

public final class Calculation {
	
	// Method designated for performing total products value calculations.
	public static Double productTotalValue(List<Product> products) {		
		double totalPrice = 0.0;
		for(int i=0; i<products.size(); i++) {
			int quantity = products.get(i).getQuantity();
			double value = products.get(i).getValue();
			
			totalPrice += quantity * value;
		}
		return totalPrice;
	}

	// Method dedicated for product registration.
	public static List<Product> productRegistration(Scanner sc, Integer numOfProducts){
		List<Product> products = new ArrayList<>();
		for(int i=0; i<numOfProducts; i++) {
			System.out.printf("Enter %dº product data.%n", i+1);
			int productId = Utils.readInt("Enter product ID: ", sc);
			int productQuantity = Utils.readInt("Enter product quantity: ", sc);
			double productPrice = Utils.readPrice("Enter product price $: ", sc);
			System.out.println();
			Product product = new Product(productId, productQuantity, productPrice);
			products.add(product);
		}
		return products;
	}
}
