package it.itis.cuneo;

public class Segmento {
    private Punto a;
    private Punto b;

    public Segmento() {
        super();
    }

    public Segmento(Punto A, Punto B) {
        this.a = A;
        this.b = B;
    }

    public void setA(Punto a) {
        this.a = a;
    }

    public void setB(Punto b) {
        this.b = b;
    }

    public Punto getA() {
        return a;
    }

    public Punto getB() {
        return b;
    }

    public String toString() {
        return "Punto A: " + this.a.toString() + "Punto B: " + this.b.toString();
    }
}
