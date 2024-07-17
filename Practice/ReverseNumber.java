package Practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// Write a program that takes a number as input and outputs its reverse.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to reverse it ");
		int input = scan.nextInt();
		int givenNum = input;
		int result = 0;
		while (givenNum != 0) {
			int digit = givenNum % 10;
			result = result * 10 + digit;
			givenNum = givenNum / 10;

		}
		System.out.println("The result is " + result);

		scan.close();

	}

}
