package com.epicode.esercizi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	private String username;
	private String name;
	private String cognome;
	private String email;
	
	public User(String username, String name, String cognome, String email) {
		super();
		this.username = username;
		this.name = name;
		this.cognome = cognome;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + ", cognome=" + cognome + ", email=" + email + "]";
	}
	
	

}
