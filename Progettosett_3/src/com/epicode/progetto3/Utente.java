package com.epicode.progetto3;

import java.util.Date;

public class Utente {
	
	private String nome;
    private String cognome;
    private Date dataNascita;
    private String numeroTessera;
	public Utente(String nome, String cognome, Date dataNascita, String numeroTessera) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.numeroTessera = numeroTessera;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getNumeroTessera() {
		return numeroTessera;
	}
	public void setNumeroTessera(String numeroTessera) {
		this.numeroTessera = numeroTessera;
	}
    
    

}
