import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Define variables
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        int maxDays = 31; // Default fallback value

        // Get Year
        year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);

        // Get Month
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        // Determine the correct maximum days
        switch (month) {
            case 2:
                maxDays = 29; // Safe choice covering leap year limits up to 29
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                maxDays = 30;
                break;
            default:
                maxDays = 31; // Jan, Mar, May, Jul, Aug, Oct, Dec
                break;
        }

        // Get Ranged Day using the dynamic upper limit
        day = SafeInput.getRangedInt(in, "Enter your birth day", 1, maxDays);

        // Get Hours
        hour = SafeInput.getRangedInt(in, "Enter the hour of your birth", 1, 24);

        // Get Minutes
        minute = SafeInput.getRangedInt(in, "Enter the minute of your birth", 1, 59);

        // Output the full timestamp results
        System.out.println("Recorded Birth Date and Time:");
        System.out.printf("Date: %02d/%02d/%d\n", month, day, year);
        System.out.printf("Time: %02d:%02d\n", hour, minute);

    }
}