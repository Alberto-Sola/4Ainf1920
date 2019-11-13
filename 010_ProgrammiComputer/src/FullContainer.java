public class FullContainer extends Exception {
    private String errorMessage;

    public FullContainer(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "Container pieno: " + this.errorMessage;
    }
}
