public class FullPortaCD extends Exception {
    private String errorMessage;

    public FullPortaCD(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "Porta-CD pieno: " + this.errorMessage;
    }
}