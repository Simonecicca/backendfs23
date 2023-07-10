package progettosett2;


import java.util.List;


public class MainProject {

	public static void main(String[] args) {
		
		Catalog catalog = new Catalog();

        Book b1 = new Book("123456789", "Book 1", 2020, 200, "Author 1", "Genre 1");
        Book b2 = new Book("987654321", "Book 2", 2018, 150, "Author 2", "Genre 2");
        Magazine m1 = new Magazine("111222333", "Magazine 1", 2022, 50, Periodicity.MONTHLY);
        Magazine m2 = new Magazine("444555666", "Magazine 2", 2023, 40, Periodicity.WEEKLY);
        
        catalog.addItem(b1);
        catalog.addItem(b2);
        catalog.addItem(m1);
        catalog.addItem(m2);
        
        System.out.println("Search by ISBN:");
        CatalogItem item = catalog.searchByIsbn("123456789");
        if (item != null) {
            System.out.println(item.getTitle());
        }
        
        System.out.println("Search by year:");
        List<CatalogItem> itemsByYear = catalog.searchByYear(2022);
        for (CatalogItem catalogItem : itemsByYear) {
            System.out.println(catalogItem.getTitle());
        }

        System.out.println("Search by author:");
        List<CatalogItem> itemsByAuthor = catalog.searchByAuthor("Author 2");
        for (CatalogItem catalogItem : itemsByAuthor) {
            System.out.println(catalogItem.getTitle());
        }

        catalog.saveCatalog("catalog.dat");
        catalog.loadCatalog("catalog.dat");
	
	}
}
