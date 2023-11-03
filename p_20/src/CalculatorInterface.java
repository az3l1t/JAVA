import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorInterface {
    private JFrame frame;
    private JTextField inputField;
    private JTextField outputField;
    private JButton calculateButton;

    public CalculatorInterface() {
        frame = new JFrame("RPN Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        inputField = new JTextField();
        outputField = new JTextField();
        outputField.setEditable(false);
        calculateButton = new JButton("Calculate");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                double result = Calculation.evaluateRPN(input);
                outputField.setText(Double.toString(result));
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(inputField);
        panel.add(calculateButton);
        panel.add(outputField);

        frame.getContentPane().add(panel);
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        CalculatorInterface calc = new CalculatorInterface();
        calc.show();
    }
}