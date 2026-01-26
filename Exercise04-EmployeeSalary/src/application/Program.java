// Description: Calculates an employee's salary based on worked hours and hourly wage.

package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee;
import model.services.Calculation;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Use dot as decimal separator.
		Scanner sc = new Scanner(System.in);
		
		Utils.mainMenu();	
		
		String name = Utils.readName("Enter employee's name: ", sc);
		Double workedHourd = Utils.readWorkedHours("Enter the number of worked hours: ", sc);
		Double valuePerHour = Utils.readValuePerHour("Enter the value per hour: ", sc);
		
		Employee emp = new Employee(name, valuePerHour, workedHourd);
		
		double result = Calculation.calculateSalary(emp, emp);
		
		System.out.printf("The employee: %s, will receive a total amount of: $ %.2f.%n", emp.getName(), result);
		
		sc.close();
	}
}
