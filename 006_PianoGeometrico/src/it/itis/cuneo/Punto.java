package it.itis.cuneo;

public class Punto {
    private int x;
    private int y;

    public Punto() {
        super();
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "Coordinata X: " + this.x + "\nCoordinata: " + this.y;
    }

    public static void main(String[] args) {
        Punto puntoA = new Punto();
        Punto puntoB = new Punto();
        Punto puntoC = new Punto();
        Punto puntoD = new Punto();
        Punto puntoE = new Punto();

        System.out.println();
    }
}
