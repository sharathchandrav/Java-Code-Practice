package PracticeSet2;

public class CombiningMultipleMethods {

	/*
	 * • Write a method isEven that takes an integer and returns true if the number
	 * is even, otherwise false. 
	 * • Write another method printEvenNumbers that takes
	 * an array of integers and uses the isEven method to print all even numbers in
	 * the array.
	 */

	public boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void printEvenNumbers(int array[]) {
		for (int number : array) {
			if (isEven(number)) {
				System.out.println(number);
			}
		}
	}

	public static void main(String[] args) {
		CombiningMultipleMethods cmm = new CombiningMultipleMethods();
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		cmm.printEvenNumbers(array);
	}

}
