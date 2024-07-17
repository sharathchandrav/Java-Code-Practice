package Practice;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// Write a program that performs matrix addition of two 2x2 matrices.
		
		int [] [] matrix1 = new int [2] [2];
		int [] [] matrix2 = new int [2] [2];
		int [] [] resultMatrix = new int [2] [2];
		
		Scanner scan = new Scanner(System.in);
		
		//Take elements for Matrix 1
		System.out.println("Enter the elements of the matrix 1");
		for(int i =0; i<2; i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Enter the elements " + i+  " " + j);
				matrix1[i][j] = scan.nextInt();
			}
		}
		
		//Take elements for Matrix 2
		System.out.println("Enter the elements of the matrix 2");
		for(int i =0; i<2; i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Enter the elements " + i+  " " + j);
				matrix2[i][j] = scan.nextInt();
			}
		}
		
		//add the Matrices
		for(int i =0; i<2; i++) {
			for(int j=0;j<2;j++) {
				resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		//print result Matrix
		System.out.println("The result matrix is ");
		for(int i =0; i<2; i++) {
			for(int j=0;j<2;j++) {
				System.out.print( resultMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
	scan.close();
	}

}
