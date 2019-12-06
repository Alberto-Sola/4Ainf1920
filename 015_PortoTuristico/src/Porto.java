import java.util.Arrays;
import java.util.Scanner;

public class Porto {
    /*Attributes*/
    public static final int NPOSTI = 100;
    private Barca[] postiBarca;

    /*Constructor*/
    public Porto() {
        postiBarca = new Barca[NPOSTI];
    }

    /*Attracca barca*/
    public void assegnaPosto(Barca barca) {
        int i ;
        //Per barca a vela
        if (barca.getTipoBarca() == TipoBarca.vela) {
            i = 50;
            while (i< NPOSTI && postiBarca[i] != null) {
                i++;
            }
            postiBarca[i] = barca;
            //Se finiscono i posti prioritari
            if (i == NPOSTI) {
                i = 20;
                while (i<50 && postiBarca[i] != null) {
                    i++;
                }
                postiBarca[i] = barca;
            }
         //Per barca a motore (meno di 10m)
        } else if (barca.getLunghezza() <= 10) {
            i = 0;
            while (i<20 && postiBarca[i] != null) {
                i++;
            }
            postiBarca[i] = barca;
         //Più di 10m
        } else {
            i = 20;
            while (i< NPOSTI && postiBarca[i] != null) {
                i++;
            }
            postiBarca[i] = barca;
        }
    }

    /*Libera posto e restituisce spesa*/
    public double liberaPosto(int i) {
        double importo;
        Scanner input = new Scanner (System.in);
        int gSosta = input.nextInt();

        /*Calocolo importo*/
        if (postiBarca[i].getTipoBarca() == TipoBarca.motore) {
            importo = 20 * postiBarca[i].getStazza() * gSosta;
        } else {
            importo = 10 * postiBarca[i].getLunghezza() * gSosta;
        }

        /*Rimozione barca*/
        postiBarca[i] = null;

        return importo;
    }

    /*Info tramite indice*/
    public String ricercaInfoWindex(int i) {
        return postiBarca[i].toString();
    }

    /*Salvataggio dati porto su file*/
    //foo()

    /*Crea array con barche della stessa nazionalità*/
    public void arrSameNationality() {
        Scanner input = new Scanner(System.in);
        String nazionalita = input.nextLine();
        Barca[] barcheSameNationality = new Barca[NPOSTI];

        int k = 0;
        for (int i = 0; i < NPOSTI; i++) {
            if (postiBarca[i].getNazionalita().equalsIgnoreCase(nazionalita)) {
                barcheSameNationality[k] = postiBarca[i];
                k++;
            }
        }
    }

    @Override
    public String toString() {
        return "Porto{" +
                "postiBarca=" + Arrays.toString(postiBarca) +
                '}';
    }

    public static void main(String[] args) {
    }
}
