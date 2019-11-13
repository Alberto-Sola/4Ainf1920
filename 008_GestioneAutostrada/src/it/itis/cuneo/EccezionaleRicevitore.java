package it.itis.cuneo;


public class EccezionaleRicevitore {
    public double divisione(int numeratore, int denominatore) {
        int quoto = 0;
        quoto = numeratore/denominatore;
        return quoto;
    }

    public static void main(String[] args) {
        EccezionaleRicevitore eccezionaleRicevitore = new EccezionaleRicevitore();

        try {
            eccezionaleRicevitore.divisione(5, 0);
        }

        catch (ArithmeticException aEx) {
            aEx.printStackTrace();
        }

        catch (Exception ex) {
            ex.printStackTrace();
        }

        finally {
            System.out.println("Ne esco sempre bene");
        }
    }
}
