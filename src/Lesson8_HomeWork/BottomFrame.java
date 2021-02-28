package Lesson8_HomeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomFrame {
    private final JPanel panel;

    public BottomFrame(JTextField inputField) {
        panel = new JPanel();
        panel.setLayout( new GridLayout(5,3));
        DigitBottomListner bottomListner = new DigitBottomListner(inputField);
        ActionListener actionListener = new ActionBottomListner();

        for (int i =0; i<=9; i++){
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(bottomListner);
            panel.add(btn);
        }

        JButton result = new JButton("=");
        result.addActionListener(bottomListner);
        panel.add(result);
        JButton clear = new JButton("C");
        panel.add(clear);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });
        JButton sum = new JButton("+");
        sum.addActionListener(bottomListner);
        sum.addActionListener(actionListener);
        panel.add(sum);

        JButton sub = new JButton("-");
        sub.addActionListener(bottomListner);
        panel.add(sub);

        JButton sqrt = new JButton("SQRT");
        sqrt.addActionListener(bottomListner);
        panel.add(sqrt);

    }

    public JPanel getPanel() {
        return panel;
    }
}
