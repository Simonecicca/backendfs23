package progettosett2;


public abstract class Catalog {
	
	private String isbn;
	private String title;
	private int pubYear;
	private int numPages;
	
	public Catalog(String isbn, String title, int pubYear, int numPages) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.pubYear = pubYear;
		this.numPages = numPages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	
	

}
