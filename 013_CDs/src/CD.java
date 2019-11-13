public class CD {
    private String titolo;
    private String autore;
    private int nBrani;
    private double durata;

    public CD() {
        super();
    }

    public CD(String titolo, String autore, int nBrani, double durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.nBrani = nBrani;
        this.durata = durata;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setnBrani(int nBrani) {
        this.nBrani = nBrani;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getnBrani() {
        return nBrani;
    }

    public double getDurata() {
        return durata;
    }

    public String toString() {
        return "{Titolo: " + titolo + ", Autore: " + autore + ", Numero brani: " + nBrani + ", Durata: " + durata + "}";
    }

    public boolean compareDurata(CD cd) {
        boolean uguali = false;

        if (this.durata == cd.getDurata()) {
            uguali = true;
        }

        return uguali;
    }
}
