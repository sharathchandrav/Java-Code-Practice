package PracticeSet2;

public class FunctionWithReturnType {
	// Write a method "multiply" that takes two integer parameters and returns their
	// product.
	
	public int multiply (int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		FunctionWithReturnType fwrt = new FunctionWithReturnType();
		
		System.out.println("The product is " + fwrt.multiply(5, 2));
	}

}
