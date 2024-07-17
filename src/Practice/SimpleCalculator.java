package Practice;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// Write a program that performs basic arithmetic operations (addition,
		// subtraction, multiplication, division) based on user input.

		Scanner scan = new Scanner(System.in);
		System.out.println("Select the type of airthematic operation to perform :");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int choice = scan.nextInt();
		System.out.println("Enter the first number : ");
		double firstNum = scan.nextDouble();
		System.out.println("Enter the second number : ");
		double secondNum = scan.nextDouble();
		double result = 0;
		switch (choice) {
		case 1:
			result = firstNum + secondNum;
			System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + result);
			break;

		case 2:
			result = firstNum - secondNum;
			System.out.println("The diff of " + firstNum + " and " + secondNum + " is " + result);
			break;

		case 3:
			result = firstNum * secondNum;
			System.out.println("The product of " + firstNum + " and " + secondNum + " is " + result);
			break;

		case 4:
			result = firstNum / secondNum;
			System.out.println("The division of " + firstNum + " and " + secondNum + " is " + result);
			break;

		default:
			System.out.println("Invalid choice");
		}
		scan.close();
	}

}
