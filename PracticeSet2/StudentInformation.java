package PracticeSet2;

/*Student Information: Design a Student class with name, studentID, and grade as attributes.
 * Implement a method to display the student’s details.*/

class Student {
	String name;
	int studentID;
	char grade;

	public Student(String name, int studentID, char grade) {
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;

	}

	public void display() {
		System.out.println("The Student name is " + name + " and Student id" + studentID + " and Grade is " + grade);
	}

}

public class StudentInformation {

	public static void main(String[] args) {
		Student student1 = new Student("Sam", 123, 'A');
		Student student2 = new Student("Susy", 564, 'B');
		Student student3 = new Student("vasu", 846, 'D');
		Student student4 = new Student("panda", 758, 'C');
		student1.display();
		student2.display();
		student3.display();
		student4.display();
	}

}
