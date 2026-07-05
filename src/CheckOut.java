import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean hasMoreItems = true;

        while (hasMoreItems) {
            // Ask user for the item price between $0.50 and $10.00 using getRangedDouble
            double itemPrice = SafeInput.getRangedDouble(in, "Enter item price", 0.50, 10.00);
            totalCost += itemPrice;

            // Verify that the user has more items using getYNConfirm
            hasMoreItems = SafeInput.getYNConfirm(in, "Do you have more items?");
        }

        // Show the total cost formatted strictly to 2 decimal places
        System.out.printf("\nTotal cost: $%.2f\n", totalCost);
    }
}
