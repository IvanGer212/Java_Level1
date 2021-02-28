package Lesson8_HomeWork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitBottomListner implements ActionListener {
    private final JTextField inputField;
    private final JTextField resultField;
    private final StringBuilder sb;
    private final DefinitionResult result;


    public DigitBottomListner(JTextField inputField, JTextField resultField) {
        this.inputField = inputField;
        this.resultField = resultField;
        sb = new StringBuilder();
        result = new DefinitionResult(0,"");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (result.checkAction(e.getActionCommand())){
            result.fillBuff(Integer.valueOf(inputField.getText()));
            inputField.setText("");
        }   else if (e.getActionCommand().equals("=")){
            result.fillBuff(Integer.valueOf(inputField.getText()));
            resultField.setText(Integer.toString(result.getResult()));
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
