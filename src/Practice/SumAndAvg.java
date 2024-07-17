package Practice;

import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {
		
		//Write a program that takes a list of numbers as input, calculates their sum, and computes the average
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Count");
		int count = scanner.nextInt();
		
		
		
		int sum = 0;
		for ( int i=0; i< count ; i++) {
			int number = scanner.nextInt();
		 sum += number;
		}
		System.out.println("The sum of the number is " + sum);
		
		int avg = sum/count;
		System.out.println("The avg is " + avg);
		
		scanner.close();

	}

}
