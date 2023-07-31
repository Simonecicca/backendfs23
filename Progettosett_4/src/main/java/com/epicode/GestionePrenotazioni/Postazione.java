package com.epicode.GestionePrenotazioni;

import jakarta.persistence.*;


@Entity
public class Postazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String codice;
	
	@Column(nullable = false)
	private String descrizione;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoPostazione tipo;
	
	@Column(nullable = false)
	private int numeroMaxOccupanti;
	
	@ManyToOne
	@JoinColumn(name = "edificio_id", nullable = false)
	private Edificio edificio;

	public Postazione(Long id, String codice, String descrizione, TipoPostazione tipo, int numeroMaxOccupanti,
			Edificio edificio) {
		super();
		this.id = id;
		this.codice = codice;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numeroMaxOccupanti = numeroMaxOccupanti;
		this.edificio = edificio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public TipoPostazione getTipo() {
		return tipo;
	}

	public void setTipo(TipoPostazione tipo) {
		this.tipo = tipo;
	}

	public int getNumeroMaxOccupanti() {
		return numeroMaxOccupanti;
	}

	public void setNumeroMaxOccupanti(int numeroMaxOccupanti) {
		this.numeroMaxOccupanti = numeroMaxOccupanti;
	}

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}

	@Override
	public String toString() {
		return "Postazione [id=" + id + ", codice=" + codice + ", descrizione=" + descrizione + ", numeroMaxOccupanti="
				+ numeroMaxOccupanti + ", edificio=" + edificio + "]";
	}
	

	
}
