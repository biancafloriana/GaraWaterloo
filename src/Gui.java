import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Gui {
    JFrame frame ;
    private JPanel panel1;
    private JTextField TextFieldCod;
    private JButton afisareTrenButton;
    private JTextArea afisareTrenText;
    private  JLabel JLabelCod;


    Gui(){
        frame = new JFrame("Program");
        frame.setSize(400,300);


        panel1 = new JPanel();

        JLabelCod = new JLabel("Cod tren:");
        panel1.add(JLabelCod);

        TextFieldCod = new JTextField(10);
        panel1.add(TextFieldCod);

        afisareTrenButton = new JButton("Afisare Tren");
        panel1.add(afisareTrenButton);

        afisareTrenText = new JTextArea(5,30);
        panel1.add(afisareTrenText);

        frame.getContentPane().add(panel1);
        frame.setVisible(true);



    }

    public void addListenerButton(ActionListener a){

        afisareTrenButton.addActionListener(a);
    }

    public String getCod() {
            return TextFieldCod.getText();
    }

    public void afisareTren(String s) {
        afisareTrenText.setText(s);
    }
}
