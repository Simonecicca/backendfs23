package eserciziday9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prodotti {

	public static void main(String[] args) {
		
	}
	
	private Long id;
	private String name;
	private String category;
	private Double price;
	
	public Prodotti(Long id, String name, String category, Double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public Double getPrice() {
		return price;
	}
	

}
