package PracticeSet2;

/*Car Details: Define a Car class with make, model, and year as attributes. 
 * Include a method to display the car’s information.*/

class Car {
	String make;
	String model;
	int year;

	public Car(String make, String model, int year) {
		this.model = model;
		this.make = make;
		this.year = year;

	}

	public void display() {
		System.out.println("The make of the car is " + make + " model is " + model + " and year is " + year);
	}
}

public class CarDetails {

	public static void main(String[] args) {
		Car car1 = new Car("Hyundai", "Accent", 2016);
		Car car2 = new Car("Hyundai", "Sonata", 2015);
		Car car3 = new Car("Honda", "Accord", 2010);
		Car car4 = new Car("Ford", "Mustang", 2012);
		car1.display();
		car2.display();
		car3.display();
		car4.display();

	}

}
