package progettosett2;


import java.util.List;


public class MainProject {

	public static void main(String[] args) {
		
		/*Ho provato a ripassare e fare il progetto ma penso di aver mischiato troppe cose random qua e là, purtroppo riesco più
		a capire la teoria ma quando mi trovo davanti al progetto la mia testa si blocca, magari riesco ad impostare
		classi etc. ma poi nell'effettivo quando si tratta di applicare metodi etc. non mi viene nulla, faccio ricerca etc. ma poi
		quello che è esce è abbastanza confuso. Comunque mi impegnerò a rimanere al passo con la teoria, provado comunque ad esercitarmi
		sul codice. A me il voto non interessa quindi le correzioni le userò per capire dove migliorare, grazie!*/
		
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
