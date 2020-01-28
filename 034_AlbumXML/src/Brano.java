public class Brano {
    private String titolo;
    private int durata;

    public Brano(){}
    public Brano(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Brano{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                '}';
    }

    public String toRowCSV() {
        return "Brano" + Libreria.SEPARATOR + titolo + Libreria.SEPARATOR + durata + "\n";
    }

    public Brano addBrano() {
        titolo = InputOutputUtility.leggiNome("Inserire titolo del brano: ");
        durata = InputOutputUtility.leggiNumero("Inserisci durata brano (in secondi): ");
        Brano brano = new Brano(titolo, durata);
        return brano;
    }
}