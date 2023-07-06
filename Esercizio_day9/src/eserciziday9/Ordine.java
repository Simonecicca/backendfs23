package eserciziday9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ordine {

	public static void main(String[] args) {
		
	}
	
	private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Prodotti> products;
    private Customer customer;

    public Ordine(Long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Prodotti> products, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Prodotti> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

}
