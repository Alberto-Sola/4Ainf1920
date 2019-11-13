package it.itis.cuneo;

public class PianoCartesiano {
    private Rettangolo rettangolo1;
    private Rettangolo rettangolo2;

    public PianoCartesiano() {
        super();
    }

    public PianoCartesiano(Rettangolo rettangolo1, Rettangolo rettangolo2, Rettangolo rettangolo3) {
        this.rettangolo1 = rettangolo1;
        this.rettangolo2 = rettangolo2;
    }

    public void setRettangolo1(Rettangolo rettangolo1) {
        this.rettangolo1 = rettangolo1;
    }

    public void setRettangolo2(Rettangolo rettangolo2) {
        this.rettangolo2 = rettangolo2;
    }

    public Rettangolo getRettangolo1() {
        return rettangolo1;
    }

    public Rettangolo getRettangolo2() {
        return rettangolo2;
    }

    public String toString() {
        return "{Rettangolo 1: " + this.rettangolo1.toString() + "\nRettangolo 2: " + this.rettangolo2.toString() + "\nRettangolo 3: " + "}";
    }


    public static void main(String[] args) {

    }
}
