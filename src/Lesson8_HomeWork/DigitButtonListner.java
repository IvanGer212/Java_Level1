package Lesson8_HomeWork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitButtonListner implements ActionListener {
    private final JTextField inputField;
    private final JTextField resultField;
    private final StringBuilder sbTemp, sbFinal;
    private final DefinitionResult result;
    private int countComand;
    private String lastComand;
    private final DelLastChar delLastChar;


    public DigitButtonListner(JTextField inputField, JTextField resultField) {
        this.inputField = inputField;
        this.resultField = resultField;
        sbTemp = new StringBuilder();
        sbFinal = new StringBuilder();
        result = new DefinitionResult(0, "");
        delLastChar = new DelLastChar("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (result.checkAction(e.getActionCommand()) && countComand == 0) {                 // Обрабатываем первое нажатие кнопок действий
            countComand++;
            lastComand = e.getActionCommand();
            result.fillBuff(Double.valueOf(resultField.getText()));
            resultField.setText("");
        }
        else if (e.getActionCommand().equals("del")){                                       // Обрабатываем нажатие кнопки del
            resultField.setText(delLastChar.createNewString(resultField.getText()));
            inputField.setText(delLastChar.createNewString(inputField.getText()));
        }
        // Выводим результат если нажаты кнопки "=", "SQRT" или любой другой команды если она вторая
        else if (e.getActionCommand().equals("=") || e.getActionCommand().equals("SQRT") || (result.checkAction(e.getActionCommand()) && countComand != 0)) {
            if (e.getActionCommand().equals("SQRT")) {
                lastComand = e.getActionCommand();
            }
            result.fillBuff(Double.valueOf(resultField.getText()));
            resultField.setText(Double.toString(result.getResult(lastComand)));
            if (result.isError()) {                                                     // Обработка ошибки при делении на ноль
                resultField.setText("Error");
            }
            result.clearBuff();
            if (result.checkAction(e.getActionCommand())) {
                result.fillBuff(Double.valueOf(resultField.getText()));
                inputField.setText(resultField.getText());
                resultField.setText("");
            }
            lastComand = e.getActionCommand();
        } else if (e.getActionCommand().equals("C")) {                                 // Обрабатываем кнопку "C"
            resultField.setText("");
            inputField.setText("");
            result.clearBuff();
            countComand = 0;
            result.acknowledgeError();
        } else {
            sbTemp.append(resultField.getText());
            sbTemp.append(((JButton) e.getSource()).getText());
            resultField.setText(sbTemp.toString());
            sbTemp.setLength(0);

        }
        if ((!e.getActionCommand().equals("C")) && (!e.getActionCommand().equals("del"))) {
            sbFinal.append(inputField.getText());
            sbFinal.append(((JButton) e.getSource()).getText());
            inputField.setText(sbFinal.toString());
            sbFinal.setLength(0);
        }
    }
}
