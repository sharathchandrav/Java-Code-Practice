package Practice;

import java.util.Scanner;

public class CheckForLeapYear {

	public static void main(String[] args) {
		// Write a program that checks if a given year is a leap year.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year to check for a Leap year or not ");
		int input = scan.nextInt();
		double result = input % 4;
		if (result == 0) {
			System.out.println("The Year " + input + " is a Leap year");
		} else {
			System.out.println("The Year " + input + " is not a Leap year");
		}
		scan.close();
	}

}
