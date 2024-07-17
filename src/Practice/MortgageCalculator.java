package Practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {

		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		int principle = 0;
		double monthlyIntrestRate = 0;
		int numberOfPayments = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("Principle ($1K - $1M) : ");
			principle = scanner.nextInt();
			if ((principle >= 1000 && principle <= 100000)) {
				break;
			}
			System.out.println("Enter a value between 1000 and 1000000");
		}

		while (true) {

			System.out.println("Annual Intrest rate: ");
			double annualIntrestRate = scanner.nextDouble();
			if ((annualIntrestRate > 0 && annualIntrestRate <= 30)) {
				monthlyIntrestRate = (annualIntrestRate / PERCENT) / MONTHS_IN_YEAR;
				break;
			}
			System.out.println("Enter a value greater than 0 or less than or equal to 30");
		}

		while (true) {

			System.out.println("Period(Years): ");
			int years = scanner.nextInt();
			if (years >= 1 && years <= 30) {
				numberOfPayments = years * MONTHS_IN_YEAR;
				break;
			}
			System.out.println("Enter a value between 1 and 30");
			
		}

				double Mortgage = principle * monthlyIntrestRate
						* (Math.pow((1 + monthlyIntrestRate), numberOfPayments))
						/ ((Math.pow((1 + monthlyIntrestRate), numberOfPayments)) - 1);

				String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);

				System.out.println("Mortgage : " + mortgageFormatted);
				
				scanner.close();

		}
	}

