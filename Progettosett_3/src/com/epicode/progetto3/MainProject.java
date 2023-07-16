package com.epicode.progetto3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MainProject {

	public static void main(String[] args) {
		ArchivioBibliotecario archivio = new ArchivioBibliotecario();

        
        Libro libro1 = new Libro("9781234567890", "Il signore degli anelli", 1954, 1000, "J.R.R. Tolkien", "Fantasy");
        archivio.aggiungiElementoCatalogo(libro1);

        Rivista rivista1 = new Rivista("9789876543210", "National Geographic", 2021, 100, Periodicita.MENSILE);
        archivio.aggiungiElementoCatalogo(rivista1);

        
        ElementoCatalogo elemento = archivio.ricercaPerISBN("9781234567890");
        if (elemento != null) {
            System.out.println("Elemento trovato: " + elemento.getTitolo());
        } else {
            System.out.println("Elemento non trovato.");
        }

        
        List<ElementoCatalogo> risultatiAutore = archivio.ricercaPerAutore("J.R.R. Tolkien");
        System.out.println("Risultati per autore:");
        for (ElementoCatalogo risultato : risultatiAutore) {
            System.out.println(risultato.getTitolo());
        }

        
        Utente utente = new Utente("Mario", "Rossi", new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1990"), "12345");
        Prestito prestito = new Prestito(utente, libro1, new Date());
        archivio.aggiungiPrestito(prestito);

        
        List<Prestito> prestitiScaduti = archivio.ricercaPrestitiScadutiNonRestituiti();
        System.out.println("Prestiti scaduti e non restituiti:");
        for (Prestito p : prestitiScaduti) {
            System.out.println("Utente: " + p.getUtente().getNome() + " " + p.getUtente().getCognome());
            System.out.println("Elemento: " + p.getElementoPrestato().getTitolo());
            System.out.println("Data di restituzione prevista: " + p.getDataRestituzionePrevista());
            System.out.println();
        }

	}

}
