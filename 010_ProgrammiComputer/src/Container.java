import java.util.Arrays;

public class Container {
    public static final int MAX_ARRAY = 5;
    private Programma[] array = new Programma[MAX_ARRAY];
    private int i;

    public Container(int n) throws FullContainer{
        if (n > MAX_ARRAY) {throw new FullContainer("I dati che si vogliono inserire sono superiori alla lunghezza del vettore!");}

        for (i = 0; i < n; i++) {
            array[i] = new Programma();
        }
    }

    public Programma getProgramma(int i) {
        return this.array[i];
    }

    public void setProgramma(int i, Programma programma) {
        this.array[i] = programma;
    }

    public void killProgramma(int i) {
        this.array[i] = null;
    }

    public int getN() {
        int acc = 0;

        for (i = 0; i < 1024; i++) {
            if (this.array[i] != null) {
                acc++;
            }
        }
        return acc;
    }

    public int cercaProgrammaPerDenominazione(String denominazione) {
        i = 0;

        while (i < 1025 && denominazione.equalsIgnoreCase(array[i].getDenominazione())) {
            i++;
        }
        if (i == 1025) {
            i = -1;
        }
        return i;
    }

    public int confrontaContenitore(Container container) {
        int acc = 0;

        for (i = 0; i < 1024; i++) {
            if (this.array[i] == container.array[i]) {
                acc++;
            }
        }
        return acc;
    }

    @Override
    public String toString() {
        return "Container: {" + Arrays.toString(array) + "}";
    }

    public static void main(String[] args) {
        try {
            Container container1 = new Container(2);
            container1.killProgramma(1);
            System.out.println(container1.toString());
            container1.setProgramma(1, new Programma("Ciao", "Albe", 1.9, "Linux", 2018));
            System.out.println(container1.toString());
            container1.setProgramma(0, new Programma("NONSO", "Albe", 1.5, "Windows", 2008));
            System.out.println(container1.toString());
            System.out.println(container1.cercaProgrammaPerDenominazione("nonso"));
        } catch (FullContainer fullContainer) {
            //System.err.println(fullContainer.toString());
            fullContainer.printStackTrace();
        }
    }
}
