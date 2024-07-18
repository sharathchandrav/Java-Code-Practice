package PracticeSet2;

/*Vehicle Inheritance: Create a Vehicle class with speed and capacity as attributes. 
 * Extend it to create Car and Bicycle classes, adding specific features for each.*/

class Vehicle {
	int speed;
	int capacity;
}

class Car1 extends Vehicle {
	void run() {
		System.out.println("The Car runs at a speed of " + speed + " and has a capacity of " + capacity);
	}
}

class Bicycle extends Vehicle {
	void run() {
		System.out.println("The Bicycle runs at a speed of " + speed + " and has a capacity of " + capacity);
	}
}

public class VehicleInheritance {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		c1.speed = 80;
		c1.capacity = 4;

		Bicycle b1 = new Bicycle();
		b1.capacity = 2;
		b1.speed = 25;

		c1.run();
		b1.run();

	}

}
