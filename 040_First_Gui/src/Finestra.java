import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Finestra extends JFrame implements ActionListener {
    JLabel lSquadra1;
    JLabel lSquadra2;
    JLabel lpunteggio;
    JTextField tSquadra1;
    JTextField tSquadra2;
    JTextField tPunteggio;
    JButton invia;
    JLabel tCompleto;

    public Finestra(){
        setTitle("First_Gui");
        initComponets();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponets() {
        this.setLayout(new FlowLayout());
        this.setBounds(500,500,750,500);
        lSquadra1 = new JLabel("Squadra 1: ");
        this.add(lSquadra1);
        tSquadra1 = new JTextField(10);
        this.add(tSquadra1);
        lSquadra2 = new JLabel("Squadra 2: ");
        this.add(lSquadra2);
        tSquadra2 = new JTextField(10);
        this.add(tSquadra2);
        lpunteggio= new JLabel("Punteggio: ");
        this.add(lpunteggio);
        tPunteggio = new JTextField(10);
        this.add(tPunteggio);
        invia = new JButton("Invia");
        this.add(invia);
        tCompleto = new JLabel("\nSquadre - Punteggi: ");
        this.add(tCompleto);
        invia.addActionListener(this);
    }



    public static void main(String[] args) {
        Finestra myWin = new Finestra();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == invia){
            tCompleto.setText(tSquadra1.getText() + " "
                    + tSquadra2.getText() + " "
                    + tPunteggio.getText() + "\n"
            );
        }
    }
}