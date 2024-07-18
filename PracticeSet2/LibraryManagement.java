package PracticeSet2;

import java.util.ArrayList;
import java.util.List;

/*Library Management: Design a Library class that has a list of Book objects. 
 * Use private access for the list and provide public methods to add books and list all available books.*/

class Books{
	
}

class Library {
	private List<String> books = new ArrayList<>();

	public void setBook(String book) {
		books.add(book);

	}

	public List<String> listBooks() {
		return books;
	}
}

public class LibraryManagement {

	public static void main(String[] args) {
		Library lib = new Library();
		lib.setBook("Harry Potter 1");
		lib.setBook("Harry Potter 2");
		lib.setBook("Harry Potter 3");
		lib.setBook("Harry Potter 4");
		lib.setBook("Harry Potter 5");
		System.out.println("The list of the books avaialable are " + lib.listBooks());
	}

}
