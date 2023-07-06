package eserciziday9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {

	public static void main(String[] args) {
		

	}
	
	 private Long id;
	    private String name;
	    private int tier;

	    public Customer(Long id, String name, int tier) {
	        this.id = id;
	        this.name = name;
	        this.tier = tier;
	    }

	    public Long getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getTier() {
	        return tier;
	    }

}
