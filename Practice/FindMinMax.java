package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMinMax {

	public static void main(String[] args) {
		// Write a program that takes a list of numbers and finds the largest and
		// smallest number in the list.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int min, max = 0;
		ArrayList<Integer> numbers = new ArrayList<>();
		while (scan.hasNextInt()) {
			numbers.add(scan.nextInt());
		}
		if (numbers.isEmpty()) {
			System.out.println("The list is empty");
		} else {
			min = numbers.get(0);
			max = numbers.get(0);
			for (int number : numbers) {
				if (number < min) {
					min = number;
				} else if (number > max) {
					max = number;
				}
			}
			System.out.println("The min no. is " + min + " and the max no. is " + max);
		}
		scan.close();
	}

}
