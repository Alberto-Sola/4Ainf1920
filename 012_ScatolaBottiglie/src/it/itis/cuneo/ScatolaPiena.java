package it.itis.cuneo;

public class ScatolaPiena extends Exception {
    private String descrizione;

    public ScatolaPiena(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Scatola piena: " + this.descrizione;
    }
}