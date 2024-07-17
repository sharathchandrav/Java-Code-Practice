package Practice;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		// Write a program that calculates the factorial of a given number using both
		// for and while loops.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Num to get factorial of it:");

		int input = scan.nextInt();
		int givenNum = input;
		int result1 = input;
		int result2 = input;

		while (givenNum > 1) {
			result1 = result1 * (givenNum - 1);
			givenNum--;
		}
		System.out.println("The factorial of " + input + " is " + result1 + " using WHILE Loop");

		for (int i = input; i > 1; i--) {
			result2 = result2 * (i - 1);
		}
		System.out.println("The factorial of " + input + " is " + result2 + " using FOR Loop");

		scan.close();
	}

}
