package it.itis.cuneo;

/**
 * Created by inf.solaa2101 on 30/09/2019.
 */
public class EseguiConversioni {

    //esempio di conversioni tra wrapper, partendo da un primitivo
    public static void main(String[] args) {
        //float: è un tipo primitivo, cioè una variabile semplice
        //Float: è una classe wrapper, contiene un primitivo dello stesso tipo e i metodi che ne permettono l'elaborazione
        float f;
        f = new Float(0.52d);
        /*
        System.out.println(String s)
        la firma del metodo sopra richiede una stringa come parametro
        quindi float viene convertito in una stringa al momento della chiamata
        System.out.println(float fPrimitivo)
        nel caso della firma sopra passiamo Float wrapper
        ma il metodo si aspetta un metodo primitivo
        */

        int n;
        String quanteMele = "8";
        n = Integer.parseInt("6");
        System.out.println(n);

        Float ogF;
        ogF = new Float(n);
        String s2;
        System.out.println("s2 = \"\" + ogF: " + s2);
        s2 = new String("" + ogF);
        System.out.println("s2 = \"\" + ogF: " + s2);
    }
}
