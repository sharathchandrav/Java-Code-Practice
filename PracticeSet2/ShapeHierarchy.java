package PracticeSet2;

/*Shape Hierarchy: Design an abstract class Shape with an abstract method draw(). 
 * Extend it to create Circle and Rectangle classes, each implementing the draw() method.*/

abstract class Shape {
	abstract void draw();

}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("I am drawing a Circle");

	}

}

class Rectangle1 extends Shape {

	@Override
	void draw() {
		System.out.println("I am drawing a Rectangle");

	}

}

public class ShapeHierarchy {

	public static void main(String[] args) {
		Shape c1 = new Circle();
		c1.draw();
		Rectangle1 r1 = new Rectangle1();
		r1.draw();

	}

}
