public class Operation_1 extends Thread{
    Buffer dati;
    private double b = 4;
    private double c = 2;
    private double d = 5;
    private double a;

    public Operation_1(Buffer d){
        dati = d;
        a = dati.a;
    }

    public void run(){
        dati.x = b*(a-c)+d;
        System.out.println("Ho calcolato x : " + dati.x);
    }
}