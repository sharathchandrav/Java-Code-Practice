package PracticeSet2;

/*Animal Kingdom: Create a base class Animal with a method makeSound(). 
 * Extend it with subclasses Dog and Cat, overriding makeSound() to make specific animal sounds.*/

class Animal {
	public void makeSound() {
		System.out.println("Animal is making Sound");
	}
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println("Bow Bow...");
	}
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("Meow Meow...");
	}
}

public class AnimalKingdom {

	public static void main(String[] args) {
		Animal d1 = new Dog();
		Cat c1 = new Cat();
		Animal a1 = new Animal();
		d1.makeSound();
		c1.makeSound();
		a1.makeSound();

	}

}
