import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get an SSN using the pattern: ^\d{3}-\d{2}-\d{4}$
        String ssnPrompt = "Enter your SSN (Format: XXX-XX-XXXX)";
        String ssnRegEx = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = SafeInput.getRegExString(in, ssnPrompt, ssnRegEx);

        // Get a UC Student M-number using the pattern: ^(M|m)\d{5}$
        String mNumPrompt = "Enter your UC Student M-Number (Format: MXXXXX)";
        String mNumRegEx = "^(M|m)\\d{5}$";
        String mNumber = SafeInput.getRegExString(in, mNumPrompt, mNumRegEx);

        // Get a menu choice using the pattern: ^[OoSsVvQq]$
        String menuPrompt = "Select an option [O = Open, S = Save, V = View, Q = Quit]";
        String menuRegEx = "^[OoSsVvQq]$";
        String menuChoice = SafeInput.getRegExString(in, menuPrompt, menuRegEx);

        // Output summary of successfully validated results
        System.out.println("\n--- Summary of Validated Entries ---");
        System.out.println("SSN: " + ssn);
        System.out.println("M Number: " + mNumber);
        System.out.println("Menu Choice: " + menuChoice);
    }
}