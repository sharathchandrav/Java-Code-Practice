package Practice;

import java.util.Scanner;

public class ArmstrongNumCheck {

	public static void main(String[] args) {
		// Write a program that checks if a given number is an Armstrong number (a
		// number that is equal to the sum of its own digits each raised to the power of
		// the number of digits).
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Num to the result:");

		int input = scan.nextInt();
		int givenNum = input;
		double singleDigit = 0;
		int numDigits = String.valueOf(givenNum).length();
		int result = 0;
				System.out.println("The no. of digits entered are " + numDigits);

		for (int i = numDigits; i > 0; i--) {
			singleDigit = givenNum % 10;
			result = result + (int) Math.pow(singleDigit, numDigits);
			givenNum = givenNum / 10;
		}
		if (result == input) {
			System.out.println("The Result is  " + result + " and it is a Armstrong number");
		} else {
			System.out.println("The Result is  " + result + " and it is not a Armstrong number");
		}

		scan.close();

	}

}
