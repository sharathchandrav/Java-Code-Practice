package PracticeSet2;

/*Rectangle Operations: Create a Rectangle class with length and width as private attributes. 
 * Provide public methods to calculate area and perimeter.*/

class Rectangle {
	private int length;
	private int width;

	public void setLength(int length) {
		this.length = length;
	}

	public void setwidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int calculateArea() {
		return length * width;
	}

	public int calculatePerimeter() {
		return 2 * (length + width);
	}

}

public class RectangleOperations {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.setLength(5);
		r1.setwidth(10);

		Rectangle r2 = new Rectangle();
		r2.setLength(4);
		r2.setwidth(5);

		System.out.println("The Area and Perimeter of a rectangle with length " + r1.getLength() + " , " + r1.getWidth()
				+ " and width are " + r1.calculateArea() + " , " + r1.calculatePerimeter());
		System.out.println("The Area and Perimeter of a rectangle with length " + r2.getLength() + " , " + r2.getWidth()
		+ " and width are " + r2.calculateArea() + " , " + r2.calculatePerimeter());

	}

}
