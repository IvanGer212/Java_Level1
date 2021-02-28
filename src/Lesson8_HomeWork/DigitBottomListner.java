package Lesson8_HomeWork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitBottomListner implements ActionListener {
    private final JTextField inputField;
    private final JTextField resultField;
    private final StringBuilder sbTemp, sbFinal;
    private final DefinitionResult result;


    public DigitBottomListner(JTextField inputField, JTextField resultField) {
        this.inputField = inputField;
        this.resultField = resultField;
        sbTemp = new StringBuilder();
        sbFinal = new StringBuilder();
        result = new DefinitionResult(0,"");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (result.checkAction(e.getActionCommand())){
            result.fillBuff(Float.valueOf(resultField.getText()));
            resultField.setText("");
        }   else if (e.getActionCommand().equals("=")){
            result.fillBuff(Float.valueOf(resultField.getText()));
            resultField.setText(Float.toString(result.getResult()));
            result.clearBuff();
        }
            else if (e.getActionCommand().equals("C")){
            resultField.setText("");
            inputField.setText("");
            result.clearBuff();
        }
            else {
            sbTemp.append(resultField.getText());
            sbTemp.append(((JButton) e.getSource()).getText());
            resultField.setText(sbTemp.toString());
            sbTemp.setLength(0);

        }
            if (!e.getActionCommand().equals("C")) {
                sbFinal.append(inputField.getText());
                sbFinal.append(((JButton) e.getSource()).getText());
                inputField.setText(sbFinal.toString());
                sbFinal.setLength(0);
            }
    }
}
