package Lesson8_HomeWork;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class TopFrame {
    private final JPanel panel;
    private final JTextField inputField;
    private final JTextField inputTopField;

    public TopFrame () {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputTopField = new JTextField();
        inputField.setEditable(false);
        inputTopField.setEditable(false);
        panel.add(inputField,BorderLayout.CENTER);
        panel.add(inputTopField,BorderLayout.NORTH);

    }

    public JPanel getPanel() {
        return panel;
    }

    public JTextField getInputField() {
        return inputField;
    }

    public JTextField getInputTopField() {
        return inputTopField;
    }
}
