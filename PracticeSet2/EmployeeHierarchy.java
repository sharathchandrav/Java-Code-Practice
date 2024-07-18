package PracticeSet2;

/*Employee Hierarchy: Define a base class Employee with attributes for name and position.
 *  Create subclasses Manager and Intern, each with additional attributes and methods.*/

class Employee1 {
	String name;
	String position;

	public Employee1(String name, String position) {
		this.name = name;
		this.position = position;

	}
}

class Manager extends Employee1 {

	int teamSize;

	public Manager(String name, String position, int teamSize) {
		super(name, position);
		this.teamSize = teamSize;
	}

	public void manageTeam() {
		System.out.println(name + " is managing a team of " + teamSize + " members.");

	}

}

class Intern extends Employee1 {

	String mentor;

	public Intern(String name, String position, String mentor) {
		super(name, position);
		this.mentor = mentor;
	}

	public void learn() {
		System.out.println(name + " is learning under mentor " + mentor + ".");
	}

}

public class EmployeeHierarchy {

	public static void main(String[] args) {

		Manager m1 = new Manager("John Doe", "Project Manager", 10);
		Intern i1 = new Intern("Alice Smith", "Software Developer Intern", "Jane Doe");

		m1.manageTeam();
		i1.learn();
	}

}
