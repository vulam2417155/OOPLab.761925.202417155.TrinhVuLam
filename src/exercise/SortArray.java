package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        double[] arr = new double[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            arr[i] = scanner.nextDouble();
        }

        // Sort
        Arrays.sort(arr);

        // Sum and average
        double sum = 0;
        for (double val : arr) {
            sum += val;
        }
        double average = sum / n;

        System.out.println("\nSorted array: " + Arrays.toString(arr));
        System.out.println("Sum    : " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}