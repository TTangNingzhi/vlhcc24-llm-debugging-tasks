import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    private final JButton[] buttons = new JButton[19];
    private final JTextField textField = new JTextField();
    boolean clear = true;
    double number = 0;
    char operator;

    public Calculator() {
        // initialize calculator board
        int unitLen = 80;
        int boundLen = 10;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(0, 0, 4 * unitLen + 6 * boundLen, 6 * unitLen + 11 * boundLen);
        setTitle("Calculator");

        // initialize textField
        textField.setBounds(boundLen, boundLen, unitLen * 4 + boundLen * 3, unitLen);
        textField.setEditable(false);
        textField.setFont(new Font("San Serif", Font.PLAIN, 30));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField);

        /* COPILOT CODE STARTS HERE */
        /* Task 2: Initialize the buttons for the calculator and add them to the frame.
         * There are 19 Buttons: include 11 digital buttons (0~9 and .),
         * 5 operator buttons (+, -, *, /, %), and
         * 2 special buttons (C and CE) for clearing and backspace functions respectively.
         * each button should have a size of 80x80 pixels
         */
        // initialize digital buttons
        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            buttons[i].setBounds(boundLen + (i % 3) * (unitLen + boundLen), boundLen * 2 + unitLen + (i / 3) * (unitLen + boundLen), unitLen, unitLen);
            buttons[i].setFont(new Font("San Serif", Font.PLAIN, 30));
            add(buttons[i]);
        }
        buttons[10] = new JButton(".");
        buttons[10].setBounds(boundLen + 3 * (unitLen + boundLen), boundLen * 2 + unitLen + 3 * (unitLen + boundLen), unitLen, unitLen);
        buttons[10].setFont(new Font("San Serif", Font.PLAIN, 30));
        add(buttons[10]);
        // initialize operator buttons
        buttons[11] = new JButton("+");
        buttons[11].setBounds(boundLen + 3 * (unitLen + boundLen), boundLen * 2 + unitLen + 2 * (unitLen + boundLen), unitLen, unitLen);
        buttons[11].setFont(new Font("San Serif", Font.PLAIN, 30));
        add(buttons[11]);
        buttons[12] = new JButton("-");
        buttons[12].setBounds(boundLen + 3 * (unitLen + boundLen), boundLen * 2 + unitLen + 1 * (unitLen + boundLen), unitLen, unitLen);
        buttons[12].setFont(new Font("San Serif", Font.PLAIN, 30));
        add(buttons[12]);
        buttons[13] = new JButton("*");
        buttons[13].setBounds(boundLen + 3 * (unitLen + boundLen), boundLen * 2 + unitLen + 0 * (unitLen + boundLen), unitLen, unitLen);
        buttons[13].setFont(new Font("San Serif", Font.PLAIN, 30));
        add(buttons[13]);
        buttons[14] = new JButton("/");
        buttons[14].setBounds(boundLen + 2 * (unitLen + boundLen), boundLen * 2 + unitLen + 3 * (unitLen + boundLen), unitLen, unitLen);
        buttons[14].setFont(new Font("San Serif", Font.PLAIN, 30));
        add(buttons[14]);
        buttons[15] = new JButton("%");
        buttons[15].setBounds(boundLen + 1 * (unitLen + boundLen), boundLen * 2 + unitLen + 3 * (unitLen + boundLen), unitLen, unitLen);
        buttons[15].setFont(new Font("San Serif", Font.PLAIN, 30));
        add(buttons[15]);
        // initialize special buttons
        buttons[16] = new JButton("C");
        buttons[16].setBounds(boundLen + 0 * (unitLen + boundLen), boundLen * 2 + unitLen + 3 * (unitLen + boundLen), unitLen, unitLen);
        buttons[16].setFont(new Font("San Serif", Font.PLAIN, 30));
        add(buttons[16]);
        buttons[17] = new JButton("CE");
        buttons[17].setBounds(boundLen + 2 * (unitLen + boundLen), boundLen * 2 + unitLen + 0 * (unitLen + boundLen), unitLen, unitLen);
        buttons[17].setFont(new Font("San Serif", Font.PLAIN, 30));
        add(buttons[17]);
        buttons[18] = new JButton("=");
        buttons[18].setBounds(boundLen + 3 * (unitLen + boundLen), boundLen * 2 + unitLen + 0 * (unitLen + boundLen), unitLen, unitLen * 2 + boundLen);
        buttons[18].setFont(new Font("San Serif", Font.PLAIN, 30));
        add(buttons[18]);


        /* COPILOT CODE ENDS HERE */
    }

    public static String formatText(double num) {
        String text = "" + num;
        if (text.lastIndexOf(".0") > 0)
            text = text.substring(0, text.length() - 2);
        return text;
    }

    public void setButtonListener() {
        for (int i = 0; i < 19; i++) {
            if (i < 10 || i == 15) {
                buttons[i].addActionListener(new DigitButtonListener(this));
            } else if (i < 15 || i == 17) {
                buttons[i].addActionListener(new OperatorButtonListener(this));
            } else {
                buttons[i].addActionListener(new SpecialButtonListener(this));
            }
        }
    }

    public void setTextField(String textField) {
        this.textField.setText(textField);
    }

    public String getTextField() {
        return textField.getText();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }

}
