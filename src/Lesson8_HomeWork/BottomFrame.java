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

        for (int i =0; i<=9; i++){
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(bottomListner);
            panel.add(btn);
        }

        panel.add(new JButton("="));
        JButton clear = new JButton("C");
        panel.add(clear);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });
        panel.add(new JButton("+"));
        panel.add(new JButton("-"));
        panel.add(new JButton("SQRT"));
    }

    public JPanel getPanel() {
        return panel;
    }
}
