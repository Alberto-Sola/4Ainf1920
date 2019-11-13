package it.itis.cuneo;

public class Vettore {
    private double x0;
    private double y0;
    private double x1;
    private double y1;

    /*
    costruttore vuoto
     */
    public Vettore() {
        super();
    }

    /*
    costruttore
     */
    public Vettore(double x0, double y0, double x1, double y1) {
        this.x0 = x0;
        this.x1 = x1;
        this.y0 = y0;
        this.y1 = y1;
    }

    /*
    costruttore per copia
     */
    public Vettore(Vettore vCopia) {
        this.x0 = vCopia.getX0();
        this.x1 = vCopia.getX1();
        this.y0 = vCopia.getY0();
        this.y1 = vCopia.getY1();
    }

    /*
    setter & getter
     */
    public void setX0(double x0) {
        this.x0 = x0;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY0(double y0) {
        this.y0 = y0;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX0() {
        return x0;
    }

    public double getX1() {
        return x1;
    }

    public double getY0() {
        return y0;
    }

    public double getY1() {
        return y1;
    }

    /*
    metodo per il controllo di vettori uguali
         */
    public boolean equals(Vettore v) {
        boolean uguali = false;
        if (this.x0 == v.getX0() && this.x1 == v.getX1() && this.y0 == v.getY0() && this.y1 == v.getY1()) {
            uguali = true;
        }
        return uguali;
    }

    /*
    metodo per il calcolo della lunghezza
     */
    public double lenght() {
        double lunghezza;
        lunghezza = Math.sqrt((this.x0-this.x1)*(this.x0-this.x1) - (this.y0-this.y1)*(this.y0-this.y1));
        return lunghezza;
    }

    /*
    metodo per creare una stringa
     */
    public String toString() {
        return "{Primo punto:\nX: " + this.x0 + "\nY: " + this.y0 + "\nSecondo punto:\nX: " + this.x1 + "\nY: " + this.y1 + "\n\nIl vettore è lungo: " + this.lenght() + "}";
    }

    /*
    main
     */
    public static void main(String[] args) {
        System.out.println("Primo vettore:");

        Vettore v = new Vettore(3, 4, 8, 4);
        Vettore v2 = new Vettore();
        Vettore vTest = new Vettore(v);

        double lunghezza = v.lenght();
        System.out.println(v.toString());

        System.out.println("\n\nSecondo vettore:");

        lunghezza = v2.lenght();
        System.out.println(v2.toString());

        System.out.println("\n\nTerzo vettore:");

        lunghezza = vTest.lenght();
        System.out.println(vTest.toString());


        System.out.println("\n\nIl primo vettore e il secondo vettore sono uguali: " + v.equals(v2));
        System.out.println("Il primo vettore e il terzo vettore sono uguali: " + v.equals(vTest));
    }
}
