package Practice;

import java.util.Scanner;

public class DiamondStarPattern {

	public static void main(String[] args) {
		// Write a program that prints a diamond pattern using stars (*).
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int n = input;
		// Print the upper part of the diamond
		for (int i = 1; i <= n; i++) {
			// Print the Spaces
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			// Print the stars
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		// Print the lower part of the diamond
		for (int i = n - 1; i >= 1; i--) {
			// Print the spaces
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			// Print the stars
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		scan.close();
	}

}
