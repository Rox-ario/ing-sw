package mediator;

import javax.swing.*;
import java.awt.*;

// Esempio di utilizzo del pattern Mediator con widgets
public class ProvaMediator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField nomeTextField = new JTextField(20);
        JTextField cognomeTextField = new JTextField(20);
        JButton salvaButton = new JButton("Salva");
        salvaButton.setEnabled(false);

        frame.add(new JLabel("Nome:"));
        frame.add(nomeTextField);
        frame.add(new JLabel("Cognome:"));
        frame.add(cognomeTextField);
        frame.add(salvaButton);

        FormMediator mediator = new FormMediator();
        mediator.setNome(nomeTextField);
        mediator.setCognome(cognomeTextField);
        mediator.setSave(salvaButton);

        nomeTextField.addActionListener( _ -> mediator.widgetCambiato(nomeTextField));
        cognomeTextField.addActionListener( _ -> mediator.widgetCambiato(cognomeTextField));
        salvaButton.addActionListener( _ -> mediator.widgetCambiato(salvaButton));

        frame.pack();
        frame.setVisible(true);
    }

}