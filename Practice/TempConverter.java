package Practice;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		// Write a program that converts temperatures from Celsius to Fahrenheit and
		// vice versa.

		Scanner scan = new Scanner(System.in);
		System.out.println("Select the conversion you need :");
		System.out.println("1. Celsius to farenheit");
		System.out.println("2. farenheit to Celsius");
		int choice = scan.nextInt();
		System.out.println("Enter the temperature :");
		double input = scan.nextDouble();
		double result = 0.0;

		switch (choice) {
		case 1:
			result = ((input * (9.0 / 5.0)) + 32);
			System.out.println(input + "°C is " + result + " °F");
			break;

		case 2:
			result = ((input - 32) * (5.0 / 9.0));
			System.out.println(input + "°F is " + result + " °C");

			break;

		default:
			System.out.println("Invalid Choice");
		}

		scan.close();

	}

}
