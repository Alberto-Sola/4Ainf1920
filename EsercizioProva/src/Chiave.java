public class Chiave {
    //attributes
    private int numeroStanza;
    private String nominativoCliente;

    //constructors
    public Chiave() {}
    public Chiave(int numeroStanza, String nominativoCliente) {
        this.numeroStanza = numeroStanza;
        this.nominativoCliente = nominativoCliente;
    }
    public Chiave(Chiave chiave) {
        this.numeroStanza = chiave.getNumeroStanza();
        this.nominativoCliente = chiave.getNominativoCliente();
    }

    //getter e setter
    public int getNumeroStanza() {
        return numeroStanza;
    }
    public void setNumeroStanza(int numeroStanza) {
        this.numeroStanza = numeroStanza;
    }
    public String getNominativoCliente() {
        return nominativoCliente;
    }
    public void setNominativoCliente(String nominativoCliente) {
        this.nominativoCliente = nominativoCliente;
    }

    @Override
    public String toString() {
        return "Chiave{" +
                "numeroStanza=" + numeroStanza +
                ", nominativoCliente='" + nominativoCliente + '\'' +
                '}';
    }

    public boolean equals(Chiave chiave) {
        boolean equal = false;
        if (numeroStanza == chiave.getNumeroStanza() && nominativoCliente.equalsIgnoreCase(chiave.getNominativoCliente())) {
            equal = true;
        }
        return equal;
    }
}