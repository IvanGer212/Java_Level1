package Lesson8_HomeWork;

import javax.swing.*;
import java.awt.*;

public class ButtonFrame {
    private final JPanel panel;

    public ButtonFrame(JTextField inputField, JTextField resultField) {
        panel = new JPanel();
        panel.setLayout( new GridLayout(5,3));
        DigitButtonListner buttonListner = new DigitButtonListner(inputField,resultField);

        for (int i =1; i<=9; i++){
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(buttonListner);
            panel.add(btn);
        }

        JButton btn = new JButton(String.valueOf(0));
        btn.addActionListener(buttonListner);
        panel.add(btn);

        JButton point = new JButton(".");
        point.addActionListener(buttonListner);
        panel.add(point);

        JButton clear = new JButton("C");
        panel.add(clear);
        clear.addActionListener(buttonListner);

        JButton sum = new JButton("+");
        sum.addActionListener(buttonListner);
        panel.add(sum);

        JButton sub = new JButton("-");
        sub.addActionListener(buttonListner);
        panel.add(sub);

        JButton multi = new JButton("*");
        multi.addActionListener(buttonListner);
        panel.add(multi);

        JButton del = new JButton("del");
        del.addActionListener(buttonListner);
        panel.add(del);


        JButton div = new JButton("/");
        div.addActionListener(buttonListner);
        panel.add(div);

        JButton sqrt = new JButton("SQRT");
        sqrt.addActionListener(buttonListner);
        panel.add(sqrt);

        JButton pow = new JButton("^");
        pow.addActionListener(buttonListner);
        panel.add(pow);

        JButton result = new JButton("=");
        result.addActionListener(buttonListner);
        panel.add(result);

    }

    public JPanel getPanel() {
        return panel;
    }
}
