package Practice;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		//Write a program that generates the multiplication table of a given number up to 10.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the no. to generate a table till 10");
		
		int number = scan.nextInt();
		for (int i=1;i<=10;i++) {
			System.out.println(number + " *" + i + " = " + (number*i));
		}
		scan.close();

	}

}
