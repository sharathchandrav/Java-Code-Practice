package PracticeSet2;

public class BasicFunctionDefinition {
	// Write a method "greet" that takes a string parameter "name" and prints
	// "Hello, name!".
	public void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}

	public static void main(String[] args) {

		BasicFunctionDefinition greeting = new BasicFunctionDefinition();
		greeting.greet("Andrea");

	}

}
