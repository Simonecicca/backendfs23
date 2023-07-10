package progettosett2;

public class Book extends CatalogItem {
	
	private String author;
	private String genre;
	public Book(String isbn, String title, int pubYear, int numPages, String author, String genre) {
		super(isbn, title, pubYear, numPages);
		this.author = author;
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
