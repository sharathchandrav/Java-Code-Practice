package PracticeSet2;

/*Employee Tasks: Design a Task class with a method performTask(). 
 * Extend it to create CodingTask and MeetingTask classes, each with a different implementation of performTask(). 
 * Show polymorphism in action.*/

class Task {
	void performTask() {
		System.out.println("Task is being performed");
	}
}

class CodingTask extends Task {
	void performTask() {
		System.out.println("Coding is ongoing");
	}
}

class MeetingTask extends Task {
	void performTask() {
		System.out.println("Meeting is ongoing");
	}
}

public class EmployeeTask {

	public static void main(String[] args) {
		Task t1 = new Task();
		Task t2 = new CodingTask();
		Task t3 = new MeetingTask();

		t1.performTask();
		t2.performTask();
		t3.performTask();

	}

}
