package Practice;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// Write a program that checks if a given number is a prime number.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. to check whether prime or not prime");

		int number = scan.nextInt();
		boolean isPrime = true;

		if (number <= 1) {
			System.out.println("The given number " + number + " is not Prime ");
		} else if (number == 2) {
			System.out.println("The given number " + number + " is Prime ");
		} else if (number > 2) {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {
				System.out.println("The given number " + number + " is Prime ");
			} else {
				System.out.println("The given number " + number + " is not Prime ");
			}

		}

		scan.close();

	}

}
