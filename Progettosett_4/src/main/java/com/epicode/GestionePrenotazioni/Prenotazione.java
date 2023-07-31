package com.epicode.GestionePrenotazioni;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Prenotazione {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "utente_id", nullable = false)
	    private Utente utente;

	    @ManyToOne
	    @JoinColumn(name = "postazione_id", nullable = false)
	    private Postazione postazione;

	    @Column(nullable = false)
	    private LocalDate dataPrenotazione;

		public Prenotazione(Long id, Utente utente, Postazione postazione, LocalDate dataPrenotazione) {
			super();
			this.id = id;
			this.utente = utente;
			this.postazione = postazione;
			this.dataPrenotazione = dataPrenotazione;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Utente getUtente() {
			return utente;
		}

		public void setUtente(Utente utente) {
			this.utente = utente;
		}

		public Postazione getPostazione() {
			return postazione;
		}

		public void setPostazione(Postazione postazione) {
			this.postazione = postazione;
		}

		public LocalDate getDataPrenotazione() {
			return dataPrenotazione;
		}

		public void setDataPrenotazione(LocalDate dataPrenotazione) {
			this.dataPrenotazione = dataPrenotazione;
		}

		@Override
		public String toString() {
			return "Prenotazione [id=" + id + ", utente=" + utente + ", postazione=" + postazione
					+ ", dataPrenotazione=" + dataPrenotazione + "]";
		}

	    

}
