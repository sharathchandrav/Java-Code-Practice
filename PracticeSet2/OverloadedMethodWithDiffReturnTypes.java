package PracticeSet2;

public class OverloadedMethodWithDiffReturnTypes {
	/*
	 * • Write overloaded methods findMax: 
	 * o One that takes two integers and
	 * returns the larger one. 
	 * o Another that takes two doubles and returns the
	 * larger one. 
	 * o Another that takes three integers and returns the largest one.
	 */
	public int findMax(int a, int b) {

		if (a > b) {
			return a;
		} else {
			return b;
		}

	}

	public double findMax(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public int findMax(int a, int b, int c) {
		return findMax(findMax(a,b),c);
	}

	public static void main(String[] args) {
		OverloadedMethodWithDiffReturnTypes omwdrt= new OverloadedMethodWithDiffReturnTypes();
		System.out.println(omwdrt.findMax(20, 30));
		System.out.println(omwdrt.findMax(23.2, 31.5));
		System.out.println(omwdrt.findMax(55, 30,40));
	}

}
