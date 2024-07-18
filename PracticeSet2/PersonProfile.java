package PracticeSet2;

/*Person Profile: Design a Person class with name, age, and email. 
 * Use private access modifiers for the attributes and provide public getter and setter methods for each.*/

class Person {
	private String name;
	private int age;
	private String email;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

}

public class PersonProfile {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();

		p1.setName("Shreya");
		p1.setEmail("shreya.goshal@gmail.com");
		p1.setAge(35);

		p2.setName("Prabhas");
		p2.setEmail("prabas.raju@gmail.com");
		p2.setAge(45);

		System.out.println("The name of the person is " + p1.getName() + " and the age and Email are " + p1.getAge()
				+ " , " + p1.getEmail());
		System.out.println("The name of the person is " + p2.getName() + " and the age and Email are " + p2.getAge()
				+ " , " + p2.getEmail());

	}

}
