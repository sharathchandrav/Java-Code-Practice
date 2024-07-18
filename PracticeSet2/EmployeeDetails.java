package PracticeSet2;

/*Employee Details: Create an Employee class with employeeID, name, and salary. 
 * Ensure the salary field is private and provide methods to set and get the salary.*/

class Employee {
	int employeeID;
	String name;
	private int salary;

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public Employee(int employeeID, String name) {
		this.employeeID = employeeID;
		this.name = name;
	}

}

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee e1 = new Employee(1234, "Thomas");
		e1.setSalary(500);

		Employee e2 = new Employee(54689, "Fatima");
		e2.setSalary(250);

		System.out.println("The salary of employee " + e1.name + " is " + e1.getSalary());
		System.out.println("The salary of employee " + e2.name + " is " + e2.getSalary());

	}

}
