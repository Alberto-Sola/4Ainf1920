public class FullContainerException extends Throwable {
    private int codice;
    private String descrizione;

    public FullContainerException(int codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "FullContainerException{" +
                "codice=" + codice +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
