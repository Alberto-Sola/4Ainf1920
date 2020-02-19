public class Main {
    public static void main(String[] args) {

        Thread_Function th1 = new Thread_Function(5);
        th1.start();
        try{
            th1.join();
            System.out.println("Fattoriale[" + th1.getNumero() + "]: " + th1.getFattoriale());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}