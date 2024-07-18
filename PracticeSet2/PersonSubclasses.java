package PracticeSet2;

/*Person Subclasses: Define a Person class with basic attributes. 
 * Create Student and Teacher subclasses that add more specific attributes like studentID for Student and subject for Teacher.*/

class Person1 {

	private String name;
	private int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Student1 extends Person1 {

	int studentID;

	public Student1(String name, int age, int studentID) {
		super(name, age);
		this.studentID = studentID;
	}

	public void printStudentInfo() {
		System.out.println("The student name is " + getName() + " age is " + getAge() + " Student ID is " + studentID);
	}

}

class Teacher extends Person1 {

	String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public void printTeacherInfo() {
		System.out.println("The Teacher name is " + getName() + " age is " + getAge() + " and teaches " + subject);
	}

}

public class PersonSubclasses {

	public static void main(String[] args) {

		Student1 s1 = new Student1("Swathi", 22, 12548);
		Teacher t1 = new Teacher("Sameera", 35, "Biology");

		s1.printStudentInfo();
		t1.printTeacherInfo();

	}

}
