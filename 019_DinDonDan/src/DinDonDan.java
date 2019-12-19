public class DinDonDan {
    public static void main(String[] args) {
        Thread thr1 = new Thread(new Campana("din", 3));
        thr1.start();
        /*try {
            thr1.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Thread thr2 = new Thread(new Campana("don", 3));
        thr2.start();
        try {
            thr2.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thr3 = new Thread(new Campana("dan", 3));
        thr3.start();
        try {
            thr3.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
