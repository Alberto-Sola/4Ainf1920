import java.util.Arrays;

public class Container {
    private Chiave[] arrChiavi;

    public Container() {}
    public Container(int maxArray) {
        arrChiavi = new Chiave[maxArray];
    }

    public Chiave[] getArrChiavi() {
        return arrChiavi;
    }

    public Chiave getChiave(int indice) {
        return arrChiavi[indice];
    }

    public void setChiave(Chiave chiave) throws FullContainerException {
        int indice = 0;
        while(indice < arrChiavi.length && arrChiavi[indice] != null) {
            indice++;
        }
        if (arrChiavi[indice] == null) {
            arrChiavi[indice] = chiave;
        } else {
            throw new FullContainerException(-1, "Il vettore è completamente occupato!");
        }
    }

    public void rmChiave(int indice) {
        arrChiavi[indice] = null;
    }

    public int getPresenze() {
        int indice, accumulatore = 0;
        for (indice = 0; indice < arrChiavi.length; indice++) {
            if (arrChiavi[indice] != null) {
                accumulatore++;
            }
        }
        return accumulatore;
    }

    public int cercaPerDenominazione(String nominativoCliente) {
        int indice = 0;
        while (indice < arrChiavi.length && !arrChiavi[indice].getNominativoCliente().equalsIgnoreCase(nominativoCliente)) {
            indice++;
        }
        if (indice == arrChiavi.length) {
            indice = -1;
        }
        return indice;
    }

    @Override
    public String toString() {
        return "Container{" +
                "arrChiavi=" + Arrays.toString(arrChiavi) +
                '}';
    }
}
