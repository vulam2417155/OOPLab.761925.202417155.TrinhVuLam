package firstprogram;

import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Enter the first number:");
        String strNum2 = JOptionPane.showInputDialog("Enter the second number:");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;

        JOptionPane.showMessageDialog(null,
            "First number: " + num1 + "\n" +
            "Second number: " + num2 + "\n" +
            "Sum: " + sum);
    }
}