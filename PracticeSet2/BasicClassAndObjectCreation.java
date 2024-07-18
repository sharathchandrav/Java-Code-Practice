package PracticeSet2;

/*Library System: Design a class Book with attributes like title, author, and ISBN. 
 * Create a method displayDetails() that prints the details of the book.*/
class Book {
	String title;
	String author;
	int isbn;

	public Book(String title, String author, int isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;

	}

	void displayDetails() {
		System.out.println("The Book " + title + " written by " + author + " and it's ISBN no. is " + isbn);
	}
}

class BasicClassAndObjectCreation {

	public static void main(String[] args) {
		Book myBook = new Book("Harry Potter", "J.K.Rowling", 987654321);
		myBook.displayDetails();
	}

}
