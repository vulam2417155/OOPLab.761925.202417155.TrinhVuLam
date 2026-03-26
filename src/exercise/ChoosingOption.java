package exercise;

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null,
            "Do you want to continue?",
            "Choose an Option",
            JOptionPane.YES_NO_CANCEL_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You chose: YES");
        } else if (choice == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You chose: NO");
        } else {
            JOptionPane.showMessageDialog(null, "You chose: CANCEL or closed the dialog.");
        }
    }
}