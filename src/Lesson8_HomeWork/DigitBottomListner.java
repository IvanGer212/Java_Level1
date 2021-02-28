package Lesson8_HomeWork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitBottomListner implements ActionListener {
    private final JTextField inputField;
    private final StringBuilder sb;
    private DefinitionResult result;


    public DigitBottomListner(JTextField inputField) {
        this.inputField = inputField;
        sb = new StringBuilder();
        result = new DefinitionResult(0,"");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("+") || e.getActionCommand().equals("-") || e.getActionCommand().equals("SQRT") || e.getActionCommand().equals("="))  {
            result.fillBuff(Integer.valueOf(inputField.getText()));
            result.checkAction(e.getActionCommand());
            inputField.setText("");
        }
            else {
            sb.append(inputField.getText());
            sb.append(((JButton) e.getSource()).getText());
            inputField.setText(sb.toString());
            sb.setLength(0);
        }
    }
}
