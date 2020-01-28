import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Libreria {
    public static final String FILE_NAME = "I:/Informatica/esercizi/034_AlbumXML/libreria.csv";
    public static final String SEPARATOR = ",";

    private List<Album> albums;

    public Libreria() {
        super();
        albums = new ArrayList<Album>();
    }

    public Libreria(List<Album> albums) {
        this.albums = albums;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public void addAlbum(Album album){
        albums.add(album);
    }

    public void caricaAlbum(Libreria libreria){
        int numeroAlbum = InputOutputUtility.leggiNumero("NUMERO DI ALBUM: ");

        Album album = new Album();
        for(int cntAlbum = 0; cntAlbum<numeroAlbum; cntAlbum++){
            album.caricaAlbum(libreria);
        }
    }

    @Override
    public String toString() {
        return "Libreria[" +
                "aAlbum=" + albums +
                ']';
    }

    public Album ricercaAlbum(String titolo){
        Album album = null;
        boolean found = false;

        for(int cntAlbum = 0; cntAlbum< albums.size(); cntAlbum++){
            album = albums.get(cntAlbum);
            if (album.getTitolo().equalsIgnoreCase(titolo)) {
                found = true;
            }
            else {
                album = null;
            }
        }
        return album;
    }

    public void salvaCSV() {
        String str ="";
        BufferedWriter bw;
        try {
            bw= new BufferedWriter(new FileWriter(FILE_NAME));

            for(int cntAlbum = 0; cntAlbum<this.albums.size(); cntAlbum++)
            {
                Album album = this.albums.get(cntAlbum);
                bw.write(album.toRowCSV());

                for(int cntBrani = 0; cntBrani<album.getBranos().size(); cntBrani++) {
                    Brano brano = album.getBranos().get(cntBrani);
                    bw.write(brano.toRowCSV());
                }
            }

            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void apriFile() {
        BufferedReader br;
        String rowLine;
        Album album = null;

        try {
            br = new BufferedReader(new FileReader(FILE_NAME));

            while((rowLine = br.readLine()) != null){
                String[] campi = rowLine.split(Libreria.SEPARATOR);
                if(campi[0].equalsIgnoreCase("Album")){
                    int id = Integer.parseInt(campi[1]);
                    album = new Album(campi[2],campi[3]);
                    addAlbum(album);
                }
                if(campi[0].equalsIgnoreCase("Brano")){
                    int id = Integer.parseInt(campi[1]);
                    int durata = Integer.parseInt(campi[4]);
                    Brano brano = new Brano(campi[2], durata);
                    album.addBrano(brano);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //TODO
    }
}
