// Description: Reads a salary value and calculates the income tax based on predefined tax brackets.

package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Salary;
import model.services.Services;
import model.utils.Utils;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Use dot as decimal separator.
		Scanner sc = new Scanner(System.in);
		
		Services.showMenu();
		
		Salary salary = new Salary(Utils.readSalary(sc));
		
		double result = Services.taxCalculator(salary);
		
		System.out.printf("Tax: $ %.2f%n", result);
		
		sc.close();
	}
}
