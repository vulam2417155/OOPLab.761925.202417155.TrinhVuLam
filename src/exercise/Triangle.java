package exercise;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print (2*i - 1) stars per row
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}