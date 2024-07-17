package Practice;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		// Write a program that takes a string as input and counts the number of vowels
		// and consonants in the string.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input String:");
		String input = scan.nextLine();
		int vowels = 0;
		int consonants = 0;

		input = input.toLowerCase();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else if (ch > 'a' && ch < 'z') {
				consonants++;
			}
		}
		System.out.println("Vowels are " + vowels + " Consonants are " + consonants);
		scan.close();
	}

}
