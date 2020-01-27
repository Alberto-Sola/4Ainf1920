import java.util.Random;

public class Playlist {
    private Brano[] playlist;

    public Playlist(int lenght) {
        playlist = new Brano[lenght];
    }

    public void addBrano(Brano brano) {
        int i = 0;
        while (i < playlist.length && playlist[i] != null) {
            i++;
        }
        if (i < playlist.length) {
            playlist[i] = brano;
        } else  {
            //Exception
        }
    }

    public void delBrano(String titolo) {
        int i = 0;
        boolean found = false;
        while (i < playlist.length && found == false) {
            if (titolo.equalsIgnoreCase(playlist[i].getTitolo())) {
                found = true;
            }
            i++;
        }
        if (i < playlist.length) {
            playlist[i] = null;
        } else  {
            //Exception
        }
    }

    public int durataTotale() {
        int i, durata = 0;
        for (i = 0; i < playlist.length; i++) {
            durata += playlist[i].getDurata();
        }
        return durata;
    }

    public Brano[] esportaBraniXnumero(int n) {
        int i;
        Brano[] array = new Brano[n];
        for (i = 0; i < n; i++) {
            array[i] = playlist[i];
            playlist[i] = null;
        }
        return array;
    }
    
    public Brano[] esportaBraniXtempo(int t) {
        int i = 0;
        Brano[] array = new Brano[playlist.length];
        while (i < playlist.length && t - playlist[i].getDurata() > playlist[i].getDurata()) {
            array[i] = playlist[i];
            playlist[i] = null;
            i++;
        }
        return array;
    }

    public void spostaGiu(int i) {
        Brano temp;
        temp = playlist[i];
        playlist[i] = playlist[i-1];
        playlist[i-1] = temp;
    }

    public void spostaSu(int i) {
        Brano temp;
        temp = playlist[i];
        playlist[i] = playlist[i+1];
        playlist[i+1] = temp;
    }

    public void riordinoCasuale() {

    }

}