import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorButtonListener extends ButtonListener implements ActionListener {
    public OperatorButtonListener(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = ((JButton) e.getSource()).getText();
        calculator.clear = true;

        double temp = Double.parseDouble(calculator.getTextField());

        if (!text.equals("=")) {
            calculator.number = temp;
            calculator.operator = text.charAt(0);
        } else {
            switch (calculator.operator) {
                case '+':
                    temp += calculator.number;
                    break;
                case '-':
                    temp = calculator.number - temp;
                    break;
                case '*':
                    temp *= calculator.number;
                    break;
                case '%':
                    try {
                        temp = calculator.number % temp;
                    } catch (ArithmeticException ex) {
                        calculator.setTextField("Divide by 0.");
                        return;
                    }
                    break;
                case '/':
                    try {
                        temp = calculator.number / temp;
                    } catch (ArithmeticException ex) {
                        calculator.setTextField("Divide by 0.");
                        return;
                    }
                    break;
            }
        }
        calculator.setTextField(Calculator.formatText(temp));
    }
}