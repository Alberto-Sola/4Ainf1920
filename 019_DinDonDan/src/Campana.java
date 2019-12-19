public class Campana implements Runnable{
    private String suono;
    private int times;

    public Campana() {
    }

    public Campana(String suono, int times) {
        this.suono = suono;
        this.times = times;
    }

    public String getSuono() {
        return suono;
    }

    public void setSuono(String suono) {
        this.suono = suono;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public void run() {
        for (int k = 0; k < times; k++) {
            System.out.println(suono);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
