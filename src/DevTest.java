import java.util.Scanner;

public class DevTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test Part A - getNonZeroLenString()
        System.out.println("\nTesting Part A: getNonZeroLenString");
        String name = SafeInput.getNonZeroLenString(in, "Enter a non-empty string");
        System.out.println("You entered: " + name);

        // Test Part B - Test getInt()
        System.out.println("\nTesting Part B: getInt");
        int anyInt = SafeInput.getInt(in, "Enter any integer");
        System.out.println("You entered: " + anyInt);

        // Test Part C - getDouble()
        System.out.println("\nTesting Part C: getDouble");
        double anyDouble = SafeInput.getDouble(in, "Enter any double");
        System.out.println("You entered: " + anyDouble);


        // Test Part D - getRangedInt()
        System.out.println("\nTesting Part D: getRangedInt");
        int rangedInt = SafeInput.getRangedInt(in, "Enter an integer in range", 10, 50);
        System.out.println("Returned value: " + rangedInt);


        // Test Part E - getRangedDouble()
        System.out.println("\nTesting Part E: getRangedDouble");
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double in range", 0.5, 9.9);
        System.out.println("Returned value: " + rangedDouble);

        // Test Part E - getYNConfirm()
        System.out.println("\nTesting Part F: getYNConfirm");
        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("Returned value (boolean): " + confirm);

        // Test Part G - getRegExString()
        System.out.println("\nTesting Part G: getRegExString (SSN Pattern)");
        String ssn = SafeInput.getRegExString(in, "Enter an SSN (e.g., 111-32-6898)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Valid SSN entered: " + ssn);

        // Test Part H - prettyHeader()
        System.out.println("\nTesting Part H: prettyHeader");
        SafeInput.prettyHeader("Message Centered Here");

    }
}

