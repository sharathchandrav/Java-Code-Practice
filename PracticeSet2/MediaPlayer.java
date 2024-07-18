package PracticeSet2;

import java.util.ArrayList;

/*Media Player: Create an interface Playable with a method play(). 
 * Implement it in Music and Video classes. Demonstrate polymorphism by creating an array of Playable objects and calling play() on each.*/

interface Playable{
	void play();
	
}

class Music implements Playable{

	@Override
	public void play() {
		System.out.println("The Music is Playing");
		
	}
	
}

class Video implements Playable{

	@Override
	public void play() {
		System.out.println("The Video is Playing");
		
	}
	
}

public class MediaPlayer {

	public static void main(String[] args) {
		
		ArrayList<Playable> objects = new ArrayList<>();
		Playable p1 = new Music();
		Playable p2 = new Video();
		Playable p3 = new Music();
		Playable p4 = new Video();
		Playable p5 = new Music();
		Playable p6 = new Video();
		Playable p7 = new Music();
		Playable p8 = new Video();
		Playable p9 = new Music();
		Playable p10 = new Music();
		objects.add(p1);
		objects.add(p2);
		objects.add(p3);
		objects.add(p4);
		objects.add(p5);
		objects.add(p6);
		objects.add(p7);
		objects.add(p8);
		objects.add(p9);
		objects.add(p10);
		
		for(Playable object : objects) {
			object.play();
		}
		

	}

}
