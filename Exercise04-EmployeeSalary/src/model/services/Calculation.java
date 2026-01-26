// Service class responsible for executing mathematical calculations.

package model.services;

import model.entities.Employee;

public final class Calculation {

	// Method dedicated for calculate employee final salary.
	public static Double calculateSalary(Employee salaryPerHour, Employee workedHours) {
		double hourValue = salaryPerHour.getValuePerHour();
		double workedTime = workedHours.getWorkedHours();
		return workedTime * hourValue;
	}
}
