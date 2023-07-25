package com.epicode.GodfathersPizza.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.GodfatersPizza.classes.DrinkLemonade;
import com.epicode.GodfatersPizza.classes.Menu;
import com.epicode.GodfatersPizza.classes.PizzaDiavola;
import com.epicode.GodfatersPizza.classes.PizzaHawaiana;
import com.epicode.GodfatersPizza.classes.PizzaMargherita;
import com.epicode.GodfatersPizza.classes.Water;
import com.epicode.GodfatersPizza.classes.Wine;

@Configuration
public class MenuConfiguration {
	
	
	@Bean
	@Scope("singleton") 
	public Menu menu() {
		Menu m = new Menu();
		
		m.getMenuPizza().add(pizzaMargherita());
		m.getMenuPizza().add(pizzaHawaiana());
		m.getMenuPizza().add(pizzaDiavola());
		
		m.getMenuDrink().add(drinkLemonade());
		m.getMenuDrink().add(drinkWater());
		m.getMenuDrink().add(drinkWine());
		
		return m;
	}
	
	@Bean
	@Scope("singleton")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean
	@Scope("singleton")
	public PizzaHawaiana pizzaHawaiana() {
		return new PizzaHawaiana();
	}
	
	@Bean
	@Scope("singleton")
	public PizzaDiavola pizzaDiavola() {
		return new PizzaDiavola();
	}
	
	//Bevande
	
	@Bean
	@Scope("singleton")
	public DrinkLemonade drinkLemonade() {
		return new DrinkLemonade();
	}
	
	@Bean
	@Scope("singleton")
	public Water drinkWater() {
		return new Water();
	}
	
	@Bean
	@Scope("singleton")
	public Wine drinkWine() {
		return new Wine();
	}
	
}
