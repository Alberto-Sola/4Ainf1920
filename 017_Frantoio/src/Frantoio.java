import java.util.ArrayList;
import java.util.List;

public class Frantoio {
    //List è un interfaccia di ArrayList<E>
    //ArrayLis<E> implementa
    private List<Oliva> listaOlive;

    public Frantoio() {}
    public Frantoio(List<Oliva> listaOlive) {
        this.listaOlive = new ArrayList<Oliva>();
    }
}
