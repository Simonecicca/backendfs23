package progettosett2;

public class Magazine extends CatalogItem {
	
	private Periodicity periodicity;

	public Magazine(String isbn, String title, int pubYear, int numPages, Periodicity periodicity) {
		super(isbn, title, pubYear, numPages);
		this.periodicity = periodicity;
	}

	public Periodicity getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(Periodicity periodicity) {
		this.periodicity = periodicity;
	}
	
	

}
