package Practice;

import java.util.Random;
import java.util.Scanner;

public class NumGuessingGame {

	public static void main(String[] args) {
		// Write a program that generates a random number between 1 and 100 and lets the
		// user guess the number, providing feedback on whether the guess is too high or
		// too low.

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int randomNum = random.nextInt(100) + 1;
		System.out.println("Enter your Guess:");
		int guess = 0;
		if (guess == randomNum) {
			System.out.println("The guess is correct it is " + randomNum);
		} else {
			while (randomNum != guess) {
				guess = scan.nextInt();
				if (guess > randomNum) {
					System.out.println("Your guess is too high, Enter again");

				} else if (guess < randomNum) {
					System.out.println("Your guess is too low, Enter again");

				} else {
					System.out.println("The guess is correct it is " + randomNum);

				}
			}
			scan.close();
		}

	}

}
