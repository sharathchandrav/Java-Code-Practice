package Practice;

import java.util.Scanner;

public class FibonacciSeq {

	public static void main(String[] args) {
		// Write a program that prints the first N numbers in the Fibonacci sequence.
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Give the no. to print Fibonacci Sequence");
		 int input = scan.nextInt();
		 
		 int first_num = 0;
		 int second_num =1;
		 int third_num = 0;
		 
		 System.out.println(first_num);
		 System.out.println(second_num);
		 
		 for(int i = 1; i<=input; i++) {
			 third_num = first_num + second_num;
			 System.out.print(third_num + " ");
			 first_num = second_num;
			 second_num = third_num;
		 }
		 scan.close();
	}

}
