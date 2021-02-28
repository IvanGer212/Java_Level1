package Lesson8_HomeWork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitBottomListner implements ActionListener {
    private final JTextField inputField;
    private final JTextField resultField;
    private final StringBuilder sbTemp, sbFinal;
    private final DefinitionResult result;
    private int countComand;
    private String lastComand;


    public DigitBottomListner(JTextField inputField, JTextField resultField) {
        this.inputField = inputField;
        this.resultField = resultField;
        sbTemp = new StringBuilder();
        sbFinal = new StringBuilder();
        result = new DefinitionResult(0,"");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (result.checkAction(e.getActionCommand()) && countComand == 0){
            countComand++;
            lastComand = e.getActionCommand();
            result.fillBuff(Double.valueOf(resultField.getText()));
            resultField.setText("");
        }   else if (e.getActionCommand().equals("=") || e.getActionCommand().equals("SQRT") || (result.checkAction(e.getActionCommand()) && countComand != 0)) {
            result.fillBuff(Double.valueOf(resultField.getText()));
            resultField.setText(Double.toString(result.getResult(lastComand)));
            if (result.isError()){
                resultField.setText("Error");
            }
            result.clearBuff();
            if (result.checkAction(e.getActionCommand())){
                result.fillBuff(Double.valueOf(resultField.getText()));
                inputField.setText(resultField.getText());
                resultField.setText("");
            }
            lastComand = e.getActionCommand();
        }
            else if (e.getActionCommand().equals("C")){
            resultField.setText("");
            inputField.setText("");
            result.clearBuff();
            countComand = 0;
            result.acknowledgeError();
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
