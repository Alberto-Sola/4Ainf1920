package it.itis.cuneo;
import java.lang.Exception;

public class Eccezione {
    public void metodoCheGenera() throws Exception {
        throw new Exception(String.valueOf(0));
    }

    public void metodoCheChiama() throws Exception {
        metodoCheGenera();
    }

    public static void main(String[] args) {

    }
}
