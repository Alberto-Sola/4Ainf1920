public class Thread_Function extends Thread {
    private int numero;
    private int fattoriale;

    public Thread_Function() {
    }

    public Thread_Function(int num) {
        this.numero = num;
        this.fattoriale = num;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFattoriale() {
        return fattoriale;
    }

    public void setFattoriale(int fattoriale) {
        this.fattoriale = fattoriale;
    }

    public void run(){
        if(this.fattoriale > 1) {

            Thread_Function threadFunction = new Thread_Function(this.numero - 1);
            threadFunction.start();
            try {
                threadFunction.join();

                System.out.println("Fattoriale[" + threadFunction.numero + "]: " + threadFunction.fattoriale);
                this.fattoriale = this.numero * threadFunction.getFattoriale();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}