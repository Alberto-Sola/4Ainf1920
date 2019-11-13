import java.util.Arrays;

public class PortaCD {
    public static final int MAX_ARRAY = 5;
    private CD[] array = new CD[MAX_ARRAY];

    public PortaCD(int n) throws FullPortaCD{
        if (n > MAX_ARRAY) {throw new FullPortaCD("I dati che si vogliono inserire sono superiori alla lunghezza del vettore!");}
        int i;

        for (i = 0; i < n; i++) {
            array[i] = new CD();
        }
    }

    public CD getCD(int i) {
        return this.array[i];
    }

    public void setCD(int i, CD cd) {
        this.array[i] = cd;
    }

    public void killCD(int i) {
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

    public int cercaCDPerTitolo(String titolo) {
        int i = 0;

        while (i < 1025 && titolo != array[i].getTitolo()) {
            i++;
        }
        if (i == 1025) {
            i = -1;
        }
        return i;
    }

    public int confrontaCollezione(PortaCD portaCD) {
        int i;
        int acc = 0;

        for (i = 0; i < 1024; i++) {
            if (this.array[i] == portaCD.array[i]) {
                acc++;
            }
        }
        return acc;
    }

    @Override
    public String toString() {
        return "Porta-CD: {" + Arrays.toString(array) + "}";
    }

    public static void main(String[] args) {
        try {
            PortaCD portaCD1 = new PortaCD(2);
            portaCD1.killCD(1);
            System.out.println(portaCD1.toString());
            portaCD1.setCD(1, new CD("Bohemian Ahlbesy", "Albe", 25,32.56));
            System.out.println(portaCD1.toString());
            portaCD1.setCD(0, new CD("nonneholaminimaidea", "bro", 15,24.32));
            System.out.println(portaCD1.toString());
        } catch (FullPortaCD fullPortaCD) {
            fullPortaCD.printStackTrace();
        }
    }
}
