package eserciziday9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainProject {

	public static void main(String[] args) {
		
		Prodotti prodotti1 = new Prodotti(1L, "Book1", "Books", 150.0);
		Prodotti prodotti2 = new Prodotti(2L, "Book2", "Books", 80.0);
		Prodotti prodotti3 = new Prodotti(3L, "Book3", "Books", 200.0);
		Prodotti prodotti4 = new Prodotti(4L, "Book4", "Books", 120.0);
		Prodotti prodotti5 = new Prodotti(5L, "Book5", "Baby Books", 40.0);
		Prodotti prodotti6 = new Prodotti(6L, "Book6", "Baby Books", 60.0);
		
		 List<Prodotti> prodotti = Arrays.asList(prodotti1, prodotti2, prodotti3, prodotti4, prodotti5, prodotti6);
		 
		 List<Prodotti> filteredProducts = prodotti.stream()
	                .filter(p -> p.getCategory().equals("Books") && p.getPrice() > 100)
	                .collect(Collectors.toList());
		 
		 for (Prodotti product : filteredProducts) {
	            System.out.println(product.getName());
		 }
		 
		 

	}
}