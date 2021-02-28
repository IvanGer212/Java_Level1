package Lesson8_HomeWork;

import javax.swing.*;
import java.awt.*;

public class BottomFrame {
    private final JPanel panel;

    public BottomFrame(JTextField inputField, JTextField resultField) {
        panel = new JPanel();
        panel.setLayout( new GridLayout(5,3));
        DigitBottomListner bottomListner = new DigitBottomListner(inputField,resultField);

        for (int i =1; i<=9; i++){
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(bottomListner);
            panel.add(btn);
        }

        JButton btn = new JButton(String.valueOf(0));
        btn.addActionListener(bottomListner);
        panel.add(btn);

        JButton point = new JButton(".");
        point.addActionListener(bottomListner);
        panel.add(point);

        JButton clear = new JButton("C");
        panel.add(clear);
        clear.addActionListener(bottomListner);

        JButton sum = new JButton("+");
        sum.addActionListener(bottomListner);
        panel.add(sum);

        JButton sub = new JButton("-");
        sub.addActionListener(bottomListner);
        panel.add(sub);

        JButton multi = new JButton("*");
        multi.addActionListener(bottomListner);
        panel.add(multi);

        JButton div = new JButton("/");
        div.addActionListener(bottomListner);
        panel.add(div);

        JButton sqrt = new JButton("SQRT");
        sqrt.addActionListener(bottomListner);
        panel.add(sqrt);

        JButton pow = new JButton("^");
        pow.addActionListener(bottomListner);
        panel.add(pow);

        JButton result = new JButton("=");
        result.addActionListener(bottomListner);
        panel.add(result);

    }

    public JPanel getPanel() {
        return panel;
    }
}
