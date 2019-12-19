public class Main {
    public static void main(String[] args) {
        Container ALBERTO = new Container(3);
        Chiave chiave1 = new Chiave(11, "Giovanni");
        Chiave chiave2 = new Chiave(8, "Lorenzo");
        Chiave chiave3 = new Chiave(63, "Luca");
        Chiave chiave4 = new Chiave(81, "Francesca");
        Chiave chiave5 = new Chiave(132, "Zizzo");
        Chiave chiave6 = new Chiave(32, "Fabrizio");
        Chiave chiave7 = new Chiave(632, "Giulia");
        Chiave chiave8 = new Chiave(832, "Ornella");
        try {
            ALBERTO.setChiave(chiave1);
            ALBERTO.setChiave(chiave2);
            ALBERTO.setChiave(chiave3);
            System.out.println(ALBERTO.toString());
            ALBERTO.rmChiave(1);
            System.out.println(ALBERTO.toString());
            ALBERTO.setChiave(chiave1);
            System.out.println(ALBERTO.toString());
            ALBERTO.setChiave(chiave1);
        } catch (FullContainerException fullContainerException) {
            System.err.println(fullContainerException.toString());;
        }
    }
}
