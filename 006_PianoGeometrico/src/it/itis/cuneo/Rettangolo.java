package it.itis.cuneo;

public class Rettangolo {
    private Segmento su;
    private Segmento giu;
    private Segmento sx;
    private Segmento dx;

    public Rettangolo() {
        super();
    }

    public Rettangolo(Segmento su, Segmento giu, Segmento sx, Segmento dx) {
        this.su = su;
        this.giu = giu;
        this.sx = sx;
        this.dx = dx;
    }

    public void setSu(Segmento su) {
        this.su = su;
    }

    public void setGiu(Segmento giu) {
        this.giu = giu;
    }

    public void setSx(Segmento sx) {
        this.sx = sx;
    }

    public void setDx(Segmento dx) {
        this.dx = dx;
    }

    public Segmento getSu() {
        return su;
    }

    public Segmento getGiu() {
        return giu;
    }

    public Segmento getSx() {
        return sx;
    }

    public Segmento getDx() {
        return dx;
    }

    public String toString() {
        return "Segmento alto: " + this.su.toString() + "\nSegmento basso: " + this.giu.toString() + "\nSegmento sinistro: " + this.sx.toString() + "\nSegmento destro: " + this.dx.toString();
    }
}
