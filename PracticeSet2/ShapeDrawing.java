package PracticeSet2;

/*Shape Drawing: Create a base class Shape with a method draw(). 
 * Implement Circle and Square classes with different implementations of draw(). Demonstrate polymorphism by calling draw() on a Shape reference.*/

class Shape1 {
	void draw() {
		System.out.println("Drawing a shape");
	};
}

class Circle1 extends Shape1 {
	void draw() {
		System.out.println("Drawing a Circle");
	}
}

class Square extends Shape1  {
	void draw() {
		System.out.println("Drawing a Square");
	}
}

public class ShapeDrawing {

	public static void main(String[] args) {
		
Shape1 c1 = new Circle1();
Shape1 s1 = new Square();
c1.draw();
s1.draw();
	}

}
