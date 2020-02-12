public class Operation_3 extends Thread{
    Buffer dati;
    private double x;
    private double z;

    public Operation_3(Buffer d){
        dati = d;
        x = dati.x;
        z = dati.z;
    }

    public void run(){
        dati.y = dati.x * dati.z;
        System.out.println("Ho calcolato y : " + dati.y);
    }
}