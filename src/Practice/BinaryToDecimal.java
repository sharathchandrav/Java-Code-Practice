package Practice;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// Write a program that converts a binary number (entered as a string) to its
		// decimal equivalent
		int result = 0;
		System.out.println("Enter the Binary number :");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int length = input.length();
		for (int i = length - 1; i >= 0; i--) {
			//Converting char to int else it will store ASCII value
			int digit = input.charAt(i) - '0';
			int position = length - 1 - i;
			result += digit * Math.pow(2, position);
		}
		System.out.println("The Decimal value is " + result);

		scan.close();
	}

}
