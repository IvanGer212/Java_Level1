package Lesson8_HomeWork;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class TopFrame {
    private final JPanel panel;
    private final JTextField inputField;

    public TopFrame () {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);
        panel.add(inputField, BorderLayout.CENTER);

    }

    public JPanel getPanel() {
        return panel;
    }

    public JTextField getInputField() {
        return inputField;
    }
}
