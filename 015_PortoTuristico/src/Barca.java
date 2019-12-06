public class Barca {
    /*Attributes*/
    private String nome;
    private String nazionalita;
    private double lunghezza;
    private double stazza;
    private TipoBarca tipoBarca;

    /*Constructors*/
    public Barca() {
    }
    public Barca(String nome, String nazionalita, double lunghezza, double stazza, TipoBarca tipoBarca) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
        this.tipoBarca = tipoBarca;
    }

    /*Getters & Setters*/
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }
    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public double getLunghezza() {
        return lunghezza;
    }
    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double getStazza() {
        return stazza;
    }
    public void setStazza(double stazza) {
        this.stazza = stazza;
    }

    public TipoBarca getTipoBarca() {
        return tipoBarca;
    }
    public void setTipoBarca(TipoBarca tipoBarca) {
        this.tipoBarca = tipoBarca;
    }

    @Override
    public String toString() {
        return "Barca{" +
                "nome='" + nome + '\'' +
                ", nazionalita='" + nazionalita + '\'' +
                ", lunghezza=" + lunghezza +
                ", stazza=" + stazza +
                ", tipoBarca=" + tipoBarca +
                '}';
    }
}
