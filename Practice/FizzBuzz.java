package Practice;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Number: ");
		int number = scanner.nextInt();

		// If a No. is divisible by 3 and 5 Print FizzBuzz
		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("FizzBuzz");
		}
		// If a No. is divisible by 5 Print Fizz
		else if (number % 5 == 0) {
			System.out.println("Fizz");
		}
		// If a No. is divisible by 3 Print Buzz

		else if (number % 3 == 0) {
			System.out.println("Buzz");
		}

		// if none print the number
		else {
			System.out.println(number);
		}
		scanner.close();

	}

}
