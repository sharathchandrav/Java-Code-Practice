package PracticeSet2;

public class MethodOverloading {
	/*
	 * Create overloaded methods "printInfo": 
	 * o One that takes a string and prints it.
	 * o Another that takes an integer and prints it. 
	 * o Another that takes a string and an integer, and prints them both.
	 */
			
	public void printInfo (String input) {
		System.out.println("The String entered is \"" + input + "\"");
	}
	
	public void printInfo (int input) {
		System.out.println("The integer entered is " + input);
	}
	
	public void printInfo (String inputString, int inputInteger) {
		System.out.println("The String entered is \"" + inputString + "\" and the integer entered is " + inputInteger);
	}
	
	public static void main(String args[]) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.printInfo("Hey There");
		mo.printInfo(500);
		mo.printInfo("Andrea", 24);
	}

}
