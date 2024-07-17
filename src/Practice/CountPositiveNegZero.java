package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class CountPositiveNegZero {

	public static void main(String[] args) {
		// Write a program that takes a list of numbers and counts how many are
		// positive, negative, and zero.

		Scanner scan = new Scanner(System.in);
		int positive = 0;
		int negative = 0;
		int zeros = 0;
		ArrayList<Integer> numbers = new ArrayList<>();
		while (scan.hasNextInt()) {
			numbers.add(scan.nextInt());
		}
		for (int number : numbers) {
			if (number > 0) {
				positive++;
			} else if (number < 0) {
				negative++;
			} else if (number == 0) {
				zeros++;
			}
		}
		System.out.println("The number of postive values are " + positive + " and number of negative values are "
				+ negative + " and number of zeros are " + zeros);
		scan.close();

	}

}
