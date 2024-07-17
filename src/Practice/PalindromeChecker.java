package Practice;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		// Write a program that checks if a given string is a palindrome (reads the same
		// forward and backward)

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. to check palindrome");
		int input = scan.nextInt();
		int Given_num = input;
		int result = 0;

		while (Given_num != 0) {
			int single_digit = Given_num % 10;

			result = (result * 10) + single_digit;
			Given_num = Given_num / 10;

		}
		if (input == result) {
			System.out.println("The given no. " + input + " is a palindrome");
		} else {
			System.out.println("The given no. " + input + " is not a palindrome");
		}
		scan.close();
	}

}
