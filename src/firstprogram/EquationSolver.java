package firstprogram;

import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String[] options = {"Linear Equation (ax + b = 0)",
                            "System of Linear Equations",
                            "Quadratic Equation (ax² + bx + c = 0)"};

        int choice = JOptionPane.showOptionDialog(null,
            "Choose the type of equation to solve:",
            "Equation Solver",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null, options, options[0]);

        if (choice == 0) {
            solveLinear();
        } else if (choice == 1) {
            solveSystem();
        } else if (choice == 2) {
            solveQuadratic();
        }
    }

    // 1. Linear equation: ax + b = 0
    static void solveLinear() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a (a ≠ 0):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "a must not be 0 for a linear equation.");
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null,
                "Linear equation: " + a + "x + " + b + " = 0\n" +
                "Solution: x = " + x);
        }
    }

    // 2. System of linear equations:
    //    a11*x1 + a12*x2 = b1
    //    a21*x1 + a22*x2 = b2
    static void solveSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
        double b1  = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
        double b2  = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));

        double D  = a11 * a22 - a12 * a21;
        double D1 = b1  * a22 - a12 * b2;
        double D2 = a11 * b2  - b1  * a21;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null,
                "Solution:\nx1 = " + x1 + "\nx2 = " + x2);
        }
    }

    // 3. Quadratic equation: ax² + bx + c = 0
    static void solveQuadratic() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a (a ≠ 0):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c:"));

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "a must not be 0 for a quadratic equation.");
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            JOptionPane.showMessageDialog(null,
                "Discriminant = " + delta + "\nThe equation has no real roots.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            JOptionPane.showMessageDialog(null,
                "Discriminant = 0\nDouble root: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null,
                "Discriminant = " + delta + "\n" +
                "x1 = " + x1 + "\n" +
                "x2 = " + x2);
        }
    }
}