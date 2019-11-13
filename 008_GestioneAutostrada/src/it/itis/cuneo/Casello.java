package it.itis.cuneo;

import java.util.Calendar; // Calendar ha anche ore, minuti e secondi

/**
 * Created by inf.viadal0106 on 21/10/2019.
 */
public class Casello {

    // Attributi
    private String id;
    private Calendar dataIn;
    private Calendar dataOut;

    // Metodi
    public Casello() {
    }

    public Casello(Calendar dataIn, Calendar dataOut, String id){
        this.id = id;

        Calendar cDataIn = Calendar.getInstance();
        cDataIn.setTime(dataIn.getTime());
        this.dataIn = cDataIn;

        Calendar cDataOut = Calendar.getInstance();
        cDataOut.setTime(dataOut.getTime());
        this.dataOut = cDataOut;
    }

    public Casello(Casello casello){
        this.id = new String(casello.getId());

        Calendar cDataIn = Calendar.getInstance();
        cDataIn.setTime(casello.getDataIn().getTime());
        this.dataIn = cDataIn;

        Calendar cDataOut = Calendar.getInstance();
        cDataOut.setTime(casello.getDataOut().getTime());
        this.dataOut = cDataOut;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Calendar getDataIn() {
        return dataIn;
    }

    public void setDataIn(Calendar dataIn) {
        this.dataIn = dataIn;
    }

    public Calendar getDataOut() {
        return dataOut;
    }

    public void setDataOut(Calendar dataOut) {
        this.dataOut = dataOut;
    }

    public static void main(String[] args) {
        Calendar cDataIn = Calendar.getInstance();
        cDataIn.setTime(cDataIn.getTime());

        System.out.println(cDataIn.getTime());
    }
}
