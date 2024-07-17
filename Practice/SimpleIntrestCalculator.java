package Practice;

import java.util.Scanner;

public class SimpleIntrestCalculator {

	public static void main(String[] args) {
		// Write a program that calculates simple interest based on user input for
		// principal, rate of interest, and time

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of principle, Rate of Intrest and time");
		int principle = scan.nextInt();
		double roi = scan.nextDouble();
		int time = scan.nextInt();

		double annual = principle * roi * time;

		System.out.println("The Annual intrest Rate is " + annual);
		scan.close();

	}

}
