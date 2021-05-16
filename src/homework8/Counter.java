package homework8;

import javax.swing.*;
import java.awt.*;


public class Counter extends JFrame {
        private int value;
        private int step;

        public Counter(int initialValue) {
            setBounds(500, 500, 450, 220);
            setTitle("counter");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setAlwaysOnTop(true);

            Font font =  new Font("Arial", Font.BOLD, 32);

            JLabel counterValueView = new JLabel(String.valueOf(value));
            counterValueView.setFont(font);
            counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
            add(counterValueView, BorderLayout.CENTER);

            JTextField textField = new JTextField();
            textField.setToolTipText("Задайте размер шага");
            add(textField, BorderLayout.NORTH);
            textField.addActionListener(e -> {
                System.out.println(textField.getText());
                 step = Integer.parseInt(textField.getText());

            });


            value = initialValue;

//            counterValueView.setText(String.valueOf(value));

            JButton decrementButton = new JButton("<");
            add(decrementButton, BorderLayout.LINE_START);
            decrementButton.setFont(font);

            JButton incrementButton = new JButton(">");
            add(incrementButton, BorderLayout.LINE_END);
            incrementButton.setFont(font);

            JButton dischargeButton = new JButton("discharge");
            add(dischargeButton,BorderLayout.SOUTH);
            dischargeButton.setFont(font);

            decrementButton.addActionListener(e -> {
                value = value - step;
                refreshCounterLabel(counterValueView);
            });

            incrementButton.addActionListener(e -> {
                value = value + step;
                refreshCounterLabel(counterValueView);
            });


            dischargeButton.addActionListener(e -> {
                value = initialValue;
                textField.setText("");
                refreshCounterLabel(counterValueView);
            });

            setVisible(true);
        }

        private void refreshCounterLabel(JLabel counterValueView) {
            counterValueView.setText(String.valueOf(value));
        }

    public static void main(String[] args) {
        new Counter(0);
    }

}

