import java.util.ArrayList;
import java.util.List;

public class Album implements Comparable{
    private String titolo;
    private String autore;
    private List<Brano> branos;

    public Album(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
        branos = new ArrayList<Brano>();
    }

    public Album() {
        branos = new ArrayList<Brano>();
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public List<Brano> getBranos() {
        return branos;
    }

    public void setBranos(List<Brano> branos) {
        this.branos = branos;
    }

    public void addBrano(Brano brano){
        this.branos.add(brano);
    }

    public void caricaAlbum(Libreria libreria){
        titolo = InputOutputUtility.leggiNome("TITOLO: ");
        autore = InputOutputUtility.leggiNome("AUTORE: ");
        Album album = new Album(titolo, autore);
        libreria.addAlbum(album);

        int numeroBrani = InputOutputUtility.leggiNumero("NUMERO BRANI: ");
        for(int cntBrani = 0; cntBrani < numeroBrani; cntBrani++) {
            Brano brano = new Brano();
            brano = brano.addBrano();
            album.addBrano(brano);
        }
    }

    @Override
    public String toString() {
        return "Album{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                '}';
    }

    public String toRowCSV() {
        return "Album" + Libreria.SEPARATOR +  titolo + Libreria.SEPARATOR + autore + "\n";
    }

    public void deleteBrano(String titolo){
        int numBrani = branos.size();
        for(int cntBrani = 0; cntBrani<numBrani; cntBrani++){
            if(branos.get(cntBrani).getTitolo().equalsIgnoreCase(titolo)) {
                this.branos.remove(cntBrani);
            }
        }
    }

    @Override
    public int compareTo(Object o) {
        Album album = (Album) o;
        if(this.titolo.equalsIgnoreCase( album.titolo))
            return 1;
        else
            return 0;
    }
}
