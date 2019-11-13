package it.itis.cuneo;

public class Angolo {
    private int g;
    private int p;
    private int s;

    //costruttori
    public Angolo() {
        super();
    }

    public Angolo(int g, int p, int s)
    {
        this.g = g;
        this.p = p;
        this.s = s;
    }

    //setter & getter
    public void setG(int g) {
        this.g = g;
    }

    public void setP(int p) {
        this.p = p;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getG() {
        return g;
    }

    public int getP() {
        return p;
    }

    public int getS() {
        return s;
    }

    //metodi
    public String visualizzaAngolo() {
        return "Gradi: " + this.g + "Primi: " + this.p + "Secondi: " + this.s;
    }

    public void aggiungiGradi(int n) {
        int of = 0;

        if (this.g + n > 360) {
            while (this.g + n <= 360) {
                of = (this.g + n) - 360;
                this.g = this.g + of;
            }
        }else{
            this.g += n;
        }
    }

    public void aggiungiPrimi(int n) {
        int of = 0;

        if (this.p + n > 60) {
            while (this.p + n <= 60) {
                of = (this.p + n) - 60;
                this.p = this.p + of;
                this.g++;
            }
        }else{
            this.p += n;
        }
    }

    public void aggiungiSecondi(int n) {
        int of = 0;

        if (this.s + n > 60) {
            while (this.s + n <= 60) {
                of = (this.s + n) - 60;
                this.s = this.s + of;
                this.p++;
                if (this.p > 60) {
                    this.p = 0;
                    this.g++;
                }
            }
        }else{
            this.s += n;
        }
    }

    public int angoloSecondi() {
        return this.g * this.p * this.s;
    }

    public void secondiAngolo(int n) {
        int of = 0;

        if (n > 60) {
            while (n <= 60) {
                of = n - 60;
                this.s = of;
                this.p++;
                if (this.p > 60) {
                    this.p = 0;
                    this.g++;
                }
            }
        }else{
            this.s = n;
        }
    }

    public int differenzaSecondi(Angolo a) {
        return (this.g * this.p * this.s) - (a.getG() * a.getP() * a.getS());
    }

    public Angolo sommaAngolo(Angolo a) {
        Angolo somma = new Angolo();
        return somma;
    }

    public static void main(String [] args)
    {
        Angolo a = new Angolo(230, 34, 14);
        Angolo b = new Angolo(359, 59, 59);
        int differenza;

        System.out.println(a.visualizzaAngolo());
        System.out.println(b.visualizzaAngolo());

        a.aggiungiGradi(12);
        a.aggiungiPrimi(5);
        a.aggiungiSecondi(70);
        System.out.println(a.visualizzaAngolo());

        /*
        Copia la somma
         */
        Angolo diff = new Angolo(somma);

        /*
        Calcolo differenza
         */
        differenza = a.differenzaSecondi(b);

        /*
        Conversione differenza
         */
        diff.secondiAngolo(differenza);

        diff.visualizzaAngolo();
    }
}