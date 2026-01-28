// Service class responsible for performing mathematical calculations and display messages.

package model.services;

import model.entities.Salary;

public final class Services {

	// Method responsible for displaying the menu.
	public static void showMenu() {
		System.out.println("-------------- Income Tax Calculator -----------------");
		System.out.println("+-------------------------------+--------------------+");
        System.out.println("| Income                        | Income Tax         |");
        System.out.println("+-------------------------------+--------------------+");
        System.out.println("| from R$ 0.00 to R$ 2000.00    | Exempt             |");
        System.out.println("| from R$ 2000.01 to R$ 3000.00 | 8%                 |");
        System.out.println("| from R$ 3000.01 to R$ 4500.00 | 18%                |");
        System.out.println("| above R$ 4500.00              | 28%                |");
        System.out.println("+-------------------------------+--------------------+");
        System.out.println();
	}
	
	// Salary range and tax definitions, change with caution !
	private static final double RANGE1_MAX = 2000.00;
	private static final double RANGE2_MAX = 3000.00;
	private static final double RANGE3_MAX = 4500.00;
	
	private static final double RANGE1_TAX = 0.08;
	private static final double RANGE2_TAX = 0.18;
	private static final double RANGE3_TAX = 0.28;
	
	// Method responsible for performing tax calculation.
	public static Double taxCalculator(Salary salary) {
		double salaryValue = salary.getValue();
		
		if(salaryValue <= RANGE1_MAX) {
			return 0.0;
		}
		
		else if(salaryValue > RANGE2_MAX && salaryValue <= RANGE3_MAX) {
			return ((RANGE2_MAX - RANGE1_MAX) * RANGE1_TAX) + ((salaryValue - RANGE2_MAX) * RANGE2_TAX);
		}
		
		else {
			return ((RANGE2_MAX - RANGE1_MAX) * RANGE1_TAX) + ((RANGE3_MAX - RANGE2_MAX) * RANGE2_TAX) + ((salaryValue - RANGE3_MAX) * RANGE3_TAX);
		}	
	}
	
}
