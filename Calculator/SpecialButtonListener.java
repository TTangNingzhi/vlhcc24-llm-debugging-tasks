import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpecialButtonListener extends ButtonListener implements ActionListener {
    public SpecialButtonListener(Calculator calculator) {
        super(calculator);
    }

    public static String backspace(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = ((JButton) e.getSource()).getText();
        if (text.equals("CE")) {
            String tempText = backspace(calculator.getTextField());
            if (tempText.equals(""))
                calculator.setTextField("0");
            else
                calculator.setTextField(tempText);
            return;
        }

        if (text.equals("C")) {
            calculator.number = 0.0;
            calculator.operator = ' ';
            calculator.setTextField("0");
            calculator.clear = true;
        }

    }
}
