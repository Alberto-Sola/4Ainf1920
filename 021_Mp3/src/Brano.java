public class Brano {
    private String titolo;
    private int durata;

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
}
