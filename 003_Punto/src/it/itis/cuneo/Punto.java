package it.itis.cuneo;

public class Punto {
    private int x;
    private int y;

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

    public int getQuadrante() {
        int quad;

        if (this.x > 0 && this.y > 0){
            quad = 1;
        }else if (this.x < 0 && this.y >0){
            quad = 2;
        }else if (this.x < 0 && this.y < 0){
            quad = 3;
        }else{
            quad = 4;
        }

        return quad;
    }

    public double getDistanza(Punto punto) {
        double ris = Math.sqrt((this.x-punto.getX())*(this.x-punto.getX()) + (this.y-punto.getY())*(this.y-punto.getX()));

        return ris;
    }

    public boolean equals(Punto punto) {
        boolean ris = false;

        if (this.x == punto.getX() && this.y == punto.getY()){
            ris = true;
        }

        return ris;
    }

    public String toString(){
        return "{X: " + this.x + ", Y: " + this.y + "}";
    }

    public static void main(String[] args) {

    }
}
