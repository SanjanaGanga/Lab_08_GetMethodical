import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0.0;

        // Ask the user for their favorite integer using SafeInput
        favInt = SafeInput.getInt(in, "Enter your favorite integer");

        // Ask the user for their favorite double using SafeInput
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");

        // Show the verified numbers back to the user
        System.out.println("\nYour favorite integer is: " + favInt);
        System.out.println("Your favorite double is: " + favDouble);
    }
}
