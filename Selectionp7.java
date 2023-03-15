import java.util.Scanner;

public class Selectionp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1 to 12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Find number of days in the given month
        int days = 0;
        switch (month) {
            case 1: // Jan
            case 3: // Mar
            case 5: // May
            case 7: // Jul
            case 8: // Aug
            case 10: // Oct
            case 12: // Dec
                days = 31;
                break;
            case 4: // Apr
            case 6: // Jun
            case 9: // Sept
            case 11: // Nov
                days = 30;
                break;
            case 2: // Feb
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Invalid month number.");
                System.exit(0);
        }

        // Output the number of days
        System.out.println(getMonthName(month) + " " + year + " has " + days + " days.");
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }
        return monthName;
    }
}
