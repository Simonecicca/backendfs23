package com.epicode.progetto3;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class ArchivioBibliotecario {
	
	private List<ElementoCatalogo> catalogo;
    private List<Prestito> prestiti;

    public ArchivioBibliotecario() {
        catalogo = new ArrayList<>();
        prestiti = new ArrayList<>();

}

    public void aggiungiElementoCatalogo(ElementoCatalogo elemento) {
        catalogo.add(elemento);
    }

    public void rimuoviElementoCatalogo(String isbn) {
        ElementoCatalogo elementoDaRimuovere = null;
        for (ElementoCatalogo elemento : catalogo) {
            if (elemento.getIsbn().equals(isbn)) {
                elementoDaRimuovere = elemento;
                break;
            }
        }

        if (elementoDaRimuovere != null) {
            catalogo.remove(elementoDaRimuovere);
        }
    }

    public ElementoCatalogo ricercaPerISBN(String isbn) {
        for (ElementoCatalogo elemento : catalogo) {
            if (elemento.getIsbn().equals(isbn)) {
                return elemento;
            }
        }
        return null;
    }

    public List<ElementoCatalogo> ricercaPerAnnoPubblicazione(int anno) {
        List<ElementoCatalogo> risultati = new ArrayList<>();
        for (ElementoCatalogo elemento : catalogo) {
            if (elemento.getAnnoPubblicazione() == anno) {
                risultati.add(elemento);
            }
        }
        return risultati;
    }

    public List<ElementoCatalogo> ricercaPerAutore(String autore) {
        List<ElementoCatalogo> risultati = new ArrayList<>();
        for (ElementoCatalogo elemento : catalogo) {
            if (elemento instanceof Libro && ((Libro) elemento).getAutore().equals(autore)) {
                risultati.add(elemento);
            }
        }
        return risultati;
    }

    public List<ElementoCatalogo> ricercaPerTitolo(String titolo) {
        List<ElementoCatalogo> risultati = new ArrayList<>();
        for (ElementoCatalogo elemento : catalogo) {
            if (elemento.getTitolo().contains(titolo)) {
                risultati.add(elemento);
            }
        }
        return risultati;
    }

    public List<Prestito> ricercaPrestitiPerNumeroTessera(String numeroTessera) {
        List<Prestito> risultati = new ArrayList<>();
        for (Prestito prestito : prestiti) {
            if (prestito.getUtente().getNumeroTessera().equals(numeroTessera)) {
                risultati.add(prestito);
            }
        }
        return risultati;
    }

    public List<Prestito> ricercaPrestitiScadutiNonRestituiti() {
        List<Prestito> risultati = new ArrayList<>();
        Date dataCorrente = new Date();
        for (Prestito prestito : prestiti) {
            if (prestito.getDataRestituzionePrevista().before(dataCorrente) && prestito.getDataRestituzioneEffettiva() == null) {
                risultati.add(prestito);
            }
        }
        return risultati;
    }
}