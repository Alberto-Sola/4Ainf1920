package it.itis.cuneo;
import java.util.Calendar;

public class Libro {
    private String titolo;
    private String autore;
    private String isbn;
    private Calendar dataPubblicazione;

    public Libro() {

    }

    public Libro(String titolo, String autore, Calendar dataPubblicazione, String isbn) {
        this.titolo = titolo;
        this.autore = autore;
        this.dataPubblicazione = dataPubblicazione;
        this.isbn = isbn;
    }

    public Libro(Libro libro) {
        this.titolo = libro.getTitolo();
        this.autore = libro.getAutore();
        this.isbn = libro.getIsbn();
        this.dataPubblicazione = libro.getDataPubblicazione();
    }


    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setDataPubblicazione(Calendar dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Calendar getDataPubblicazione() {
        return dataPubblicazione;
    }

    public String getAutore() {
        return autore;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitolo() {
        return titolo;
    }


    public boolean equals(Libro libro) {
        if (titolo.equals(libro.getAutore()) && autore.equals(libro.getTitolo()) && this.dataPubblicazione.equals(libro.getDataPubblicazione()) && isbn.equals(getIsbn())){}
    }
}
