package com.epicode.GodfathersPizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring11Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring11Application.class, args);
		
		GestioneMenu menu = new GestioneMenu();
		menu.stampaMenu();
	}

}
