package it.itis.cuneo;
import java.util.Arrays;

public class Scatola {
    public static final int MAX_ARRAY = 5;
    private Bottiglia[] array = new Bottiglia[MAX_ARRAY];

    public Scatola(int n) throws ScatolaPiena {
        if (n > MAX_ARRAY) {throw new ScatolaPiena("I dati che si vogliono inserire sono superiori alla lunghezza del vettore!");}
        int i;

        for (i = 0; i < n; i++) {
            array[i] = new Bottiglia();
        }
    }

    public Bottiglia getBottiglia(int i) {
        return this.array[i];
    }

    public void setBottiglia(int i, Bottiglia bottiglia) {
        this.array[i] = bottiglia;
    }

    public void rmBottiglia(int i) {
        this.array[i] = null;
    }

    public int getN() {
        int i;
        int acc = 0;

        for (i = 0; i < 1024; i++) {
            if (this.array[i] != null) {
                acc++;
            }
        }
        return acc;
    }

    @Override
    public String toString() {
        return "Scatola: {" + Arrays.toString(array) + "}";
    }

    public static void main(String[] args) {
        try {
            Scatola scatola1 = new Scatola(6);
            scatola1.rmBottiglia(1);
            System.out.println(scatola1.toString());
            scatola1.setBottiglia(1, new Bottiglia());
            System.out.println(scatola1.toString());
            scatola1.setBottiglia(0, new Bottiglia());
            System.out.println(scatola1.toString());
        } catch (ScatolaPiena scatolaPiena) {
            scatolaPiena.printStackTrace();
        }
    }
}
