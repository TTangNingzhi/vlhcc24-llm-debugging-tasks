import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitButtonListener extends ButtonListener implements ActionListener {

    public DigitButtonListener(Calculator calculator) {
        super(calculator);
    }

    private boolean inString(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                return true;
        }
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = ((JButton) e.getSource()).getText();

        if (text.equals(".")) {
            if (calculator.clear) {
                calculator.setTextField("0.");
                calculator.clear = false;
            } else if (!inString(calculator.getTextField(), '.')) {
                calculator.setTextField(calculator.getTextField() + ".");
            }
            return;
        }
        int digit = Integer.parseInt(text);

        if (digit == 0 && calculator.getTextField().equals("0")) return;

        if (calculator.clear) {
            calculator.setTextField("" + digit);
            calculator.clear = false;
        } else {
            calculator.setTextField(calculator.getTextField() + digit);
        }
    }
}
