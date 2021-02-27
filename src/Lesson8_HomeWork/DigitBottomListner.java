package Lesson8_HomeWork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitBottomListner implements ActionListener {
    private final JTextField inputField;
    private final StringBuilder sb;

    public DigitBottomListner(JTextField inputField) {
        this.inputField = inputField;
        sb = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sb.append(inputField.getText());
        sb.append (((JButton) e.getSource()).getText());
        inputField.setText(sb.toString());
        sb.setLength(0);
    }
}
