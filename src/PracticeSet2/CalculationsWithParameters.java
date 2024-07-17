package PracticeSet2;

public class CalculationsWithParameters {

	// Write a method "calculateArea" that calculates the area of a rectangle. Use
	// method overloading to handle both integer and double parameters.
	
	public int calculateArea(int length, int width) {
		return length * width;
	}
	
	public double calculateArea(double length, double width) {
		return length * width;
	}

	public static void main(String[] args) {
		CalculationsWithParameters cwp = new CalculationsWithParameters();
		int area = cwp.calculateArea(5, 2);
		double areaInDouble = cwp.calculateArea(2.3, 5.3);
		
		System.out.println("the area in integer is " + area + " and area in double is "+ areaInDouble);

	}

}
