
package libraryPackage;

public class Book extends Product {

	private String isbn;
	private int numberOfPage;
	private Person author;
	private Person editor;
		
	public Book() {
		this("",0,new Person(), new Person());
	}
	public Book(String isbn) {
		this(isbn ,0 ,new Person(), new Person());
	}
	public Book(String isbn, int numberOfPage, Person author, Person editor) {
		this.isbn = isbn;
		this.numberOfPage = numberOfPage;
		this.author = author;
		this.editor = editor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNumberOfPage() {
		return numberOfPage;
	}
	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}
	public Person getAuthor() {
		return author;
	}
	public void setAuthor(Person author) {
		this.author = author;
	}
	public Person getEditor() {
		return editor;
	}
	public void setEditor(Person editor) {
		this.editor = editor;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", numberOfPage= " + numberOfPage + ", author= " + author + ", editor= " + editor
				+ " \n" + super.toString() + "]";
	}

		
}
