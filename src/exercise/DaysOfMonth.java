package exercise;

import java.util.Scanner;

public class DaysOfMonth {

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int getMonthNumber(String input) {
        switch (input.toLowerCase()) {
            case "january":  case "jan.": case "jan": case "1":  return 1;
            case "february": case "feb.": case "feb": case "2":  return 2;
            case "march":    case "mar.": case "mar": case "3":  return 3;
            case "april":    case "apr.": case "apr": case "4":  return 4;
            case "may":                               case "5":  return 5;
            case "june":                 case "jun": case "6":  return 6;
            case "july":                 case "jul": case "7":  return 7;
            case "august":   case "aug.": case "aug": case "8":  return 8;
            case "september":case "sept.":case "sep": case "9":  return 9;
            case "october":  case "oct.": case "oct": case "10": return 10;
            case "november": case "nov.": case "nov": case "11": return 11;
            case "december": case "dec.": case "dec": case "12": return 12;
            default: return -1;
        }
    }

    static int getDays(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
            case 2: return isLeapYear(year) ? 29 : 28;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = -1;
        int year  = -1;

        // Get valid month
        while (month == -1) {
            System.out.print("Enter month (name, abbreviation, or number): ");
            String monthInput = scanner.nextLine().trim();
            month = getMonthNumber(monthInput);
            if (month == -1) {
                System.out.println("Invalid month. Please try again.");
            }
        }

        // Get valid year
        while (year < 0) {
            System.out.print("Enter year (non-negative number, all digits): ");
            String yearInput = scanner.nextLine().trim();
            if (yearInput.matches("\\d+")) {
                year = Integer.parseInt(yearInput);
            } else {
                System.out.println("Invalid year. Please enter a non-negative integer.");
            }
        }

        int days = getDays(month, year);
        System.out.println("Month " + month + " of year " + year
            + (isLeapYear(year) ? " (Leap Year)" : " (Common Year)")
            + " has " + days + " days.");

        scanner.close();
    }
}