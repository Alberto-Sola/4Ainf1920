package it.itis.cuneo;

public class Libreria {
    public static final int MAX_LIBRI = 10;
    private Libro[] vLibri;
    private int cntLibro;


    public Libreria() {
        vLibri = new Libro[MAX_LIBRI];
        cntLibro = 0;
    }

    public void addLibro(Libro libro) {
        vLibri[cntLibro] = libro;
        cntLibro++;
    }
}
