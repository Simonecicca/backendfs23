package eserciziday9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainProject {

	public static void main(String[] args) {
		
		Prodotti p1 = new Prodotti(1L, "Book1", "Books", 150.0);
		Prodotti p2 = new Prodotti(2L, "Book2", "Books", 80.0);
		Prodotti p3 = new Prodotti(3L, "Book3", "Books", 200.0);
		Prodotti p4 = new Prodotti(4L, "Book4", "Books", 120.0);
		Prodotti p5 = new Prodotti(5L, "Book5", "Baby Books", 40.0);
		Prodotti p6 = new Prodotti(6L, "Book6", "Baby Books", 60.0);
		
		 List<Prodotti> prodotti = Arrays.asList(p1, p2, p3, p4, p5, p6);
		 
		 Customer c1 = new Customer(1L, "Mario Rossi", 1);
		 Customer c2 = new Customer(2L, "Giuseppe Verdi", 2);
		 
		 Ordine o1 = new Ordine(1L, "Non spedito", LocalDate.of(2023, 2, 1), LocalDate.of(2023, 1, 2023), Arrays.asList(p1, p3), c1);
		 Ordine o2 = new Ordine(2L, "Consegnato", LocalDate.of(2023, 02, 6), LocalDate.of(2023, 02, 8), Arrays.asList(p1, p3, p6), c2);
		 
		 listaOrdine.add(o1);
		 
		 List<Prodotti> filteredProducts = prodotti.stream()
	                .filter(p -> p.getCategory().equals("Books") && p.getPrice() > 100)
	                .collect(Collectors.toList());
		 
		 for (Prodotti product : filteredProducts) {
	            System.out.println(product.getName());
		 }
		 
		 

	}
}