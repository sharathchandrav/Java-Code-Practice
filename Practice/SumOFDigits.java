package Practice;

import java.util.Scanner;

public class SumOFDigits {

	public static void main(String[] args) {
		// Write a program that calculates the sum of the digits of a given number.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to get a sum of it ");
		int input = scan.nextInt();
		int givenNum = input;
		int result =0;
		while(givenNum!=0) {
			int digit = givenNum%10;
			result = result + digit;
			givenNum= givenNum/10;
			
		}
		System.out.println("The result is " + result );
		
		scan.close();



	}

}
