package PracticeSet2;

import java.util.ArrayList;

/*Animal Sounds: Define a SoundMaker interface with a method makeSound(). 
 * Implement it in Dog and Bird classes with different sounds. Use an ArrayList to store SoundMaker objects and invoke makeSound() on each.*/

interface SoundMaker{
	void makeSound();
}

class Dog1 implements SoundMaker{

	@Override
	public void makeSound() {
		System.out.println("Bow Bow....");
		
	}
	
}
class Bird implements SoundMaker{

	@Override
	public void makeSound() {
		System.out.println("Chrip Chrip....");
		
	}
	
}

public class AnimalSounds {

	public static void main(String[] args) {
			ArrayList<SoundMaker> objects = new ArrayList<>();
			SoundMaker s1 = new Dog1();
			objects.add(s1);
			SoundMaker s2 = new Dog1();
			SoundMaker s3 = new Bird();
			SoundMaker s4 = new Dog1();
			SoundMaker s5 = new Bird();
			SoundMaker s6 = new Dog1();
			SoundMaker s7 = new Bird();
			objects.add(s2);
			objects.add(s3);
			objects.add(s4);
			objects.add(s5);
			objects.add(s6);
			objects.add(s7);
			
			for(SoundMaker object : objects) {
				object.makeSound();
			}
	}

}
