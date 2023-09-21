package p12JavaConfig.p2WithoutComponentAnnotation;

public class Student {
	private Book book;

	public Student(Book book) {
		super();
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public void study() {
		System.out.println("Student is studying...");
		book.display();
	}
}
