package com.epicode.progetto3;

import java.util.Date;

public class Prestito {

	private Utente utente;
    private ElementoCatalogo elementoPrestato;
    private Date dataInizioPrestito;
    private Date dataRestituzionePrevista;
    private Date dataRestituzioneEffettiva;
    
	public Prestito(Utente utente, ElementoCatalogo elementoPrestato, Date dataInizioPrestito,
			Date dataRestituzionePrevista, Date dataRestituzioneEffettiva) {
		super();
		this.utente = utente;
		this.elementoPrestato = elementoPrestato;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista =  new Date(dataRestituzionePrevista.getTime() + (30 * 24 * 60 * 60 * 1000));
		this.dataRestituzioneEffettiva =dataRestituzioneEffettiva;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public ElementoCatalogo getElementoPrestato() {
		return elementoPrestato;
	}

	public void setElementoPrestato(ElementoCatalogo elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}

	public Date getDataInizioPrestito() {
		return dataInizioPrestito;
	}

	public void setDataInizioPrestito(Date dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}

	public Date getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}

	public void setDataRestituzionePrevista(Date dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}

	public Date getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}

	public void setDataRestituzioneEffettiva(Date dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}
    
    
	
}
