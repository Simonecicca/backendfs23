package progettosett2;

import java.util.ArrayList;
import java.util.List;
//import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
//import java.io.FileInputStream;



public abstract class Catalog {
	
	private List<CatalogItem> items;

    public Catalog() {
        items = new ArrayList<>();
    }

    public void addItem(CatalogItem item) {
        items.add(item);
    }

    public void removeItem(String isbn) {
        items.removeIf(item -> item.getIsbn().equals(isbn));
    }

    public CatalogItem searchByIsbn(String isbn) {
        return items.stream()
                .filter(item -> item.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }

    public List<CatalogItem> searchByYear(int year) {
        return items.stream()
                .filter(item -> item.getPubYear() == year)
                .toList();
    }

    public List<CatalogItem> searchByAuthor(String author) {
        return items.stream()
                .filter(item -> item instanceof Book)
                .filter(item -> ((Book) item).getAuthor().equals(author))
                .toList();
    }

    public void saveCatalog(String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(items);
            System.out.println("Catalog saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving catalog: " + e.getMessage());
        }
    }


	
}
