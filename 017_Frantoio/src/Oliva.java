import java.util.Calendar;

public class Oliva {
    private ColoreOliva coloreOliva;
    private MaturazioneOliva maturazioneOliva;
    private String codiceOliva;
    private Calendar dataRaccolta;

    public Oliva(ColoreOliva coloreOliva) {}
    public Oliva(ColoreOliva coloreOliva, MaturazioneOliva maturazioneOliva, String codiceOliva, Calendar dataRaccolta) {
        this.coloreOliva = coloreOliva;
        this.maturazioneOliva = maturazioneOliva;
        this.codiceOliva = codiceOliva;
        this.dataRaccolta = dataRaccolta;
    }

    public ColoreOliva getColoreOliva() {
        return coloreOliva;
    }

    public void setColoreOliva(ColoreOliva coloreOliva) {
        this.coloreOliva = coloreOliva;
    }

    public MaturazioneOliva getMaturazioneOliva() {
        return maturazioneOliva;
    }

    public void setMaturazioneOliva(MaturazioneOliva maturazioneOliva) {
        this.maturazioneOliva = maturazioneOliva;
    }

    public String getCodiceOliva() {
        return codiceOliva;
    }

    public void setCodiceOliva(String codiceOliva) {
        this.codiceOliva = codiceOliva;
    }

    public Calendar getDataRaccolta() {
        return dataRaccolta;
    }

    public void setDataRaccolta(Calendar dataRaccolta) {
        this.dataRaccolta = dataRaccolta;
    }

    @Override
    public String toString() {
        return "Oliva{" +
                "coloreOliva=" + coloreOliva +
                ", maturazioneOliva=" + maturazioneOliva +
                ", codiceOliva='" + codiceOliva + '\'' +
                ", dataRaccolta=" + dataRaccolta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oliva oliva = (Oliva) o;

        if (coloreOliva != oliva.coloreOliva) return false;
        if (maturazioneOliva != oliva.maturazioneOliva) return false;
        if (codiceOliva != null ? !codiceOliva.equals(oliva.codiceOliva) : oliva.codiceOliva != null) return false;
        return dataRaccolta != null ? dataRaccolta.equals(oliva.dataRaccolta) : oliva.dataRaccolta == null;
    }
}
