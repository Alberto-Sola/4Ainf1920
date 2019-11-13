package it.itis.cuneo;

public class Frazione {
    private int num;
    private int den;

    public Frazione(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public Frazione getSomma(Frazione frazione) {
        Frazione ris = new Frazione(this.den*frazione.den, (this.num*frazione.den) + (this.den*frazione.num));
        return ris;
    }

    public Frazione getProdotto(Frazione frazione) {
        Frazione ris = new Frazione(this.den * frazione.den, this.num * frazione.num);
        return ris;
    }

    public Frazione getDifferenza(Frazione frazione) {
        Frazione ris = new Frazione(this.den*frazione.den, (this.num*frazione.den) - (this.den*frazione.num));
        return ris;
    }

    public Frazione getQuoziente(Frazione frazione) {
        Frazione ris = new Frazione(this.den * frazione.num, this.num * frazione.den);
        return ris;
    }

    /*
    public Frazione getReciproco() {
        int jolly;
        jolly = this.num;
        this.num = this.den;
        this.den = jolly;
    }
     */

    public static void main(String[] args) {
        Frazione A = new Frazione(2, 5);
        Frazione B = new Frazione(3, 7);

        A = A.getSomma(B);
        System.out.println("{La somma è " + A + "}");

        A.setNum(2);
        A.setDen(5);

        A.getDifferenza(B);
        System.out.println("La differenza è " + A);

        A.setNum(2);
        A.setDen(5);



    }


}
