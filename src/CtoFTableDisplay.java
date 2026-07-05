public class CtoFTableDisplay {
    public static void main(String[] args) {
        // Table Header
        System.out.printf("%-10s | %-10s\n", "Celsius", "Fahrenheit");
        System.out.println("-------------------------");

        // Loop from -100 to 100 in 1-degree increments using a for loop
        for (int celsius = -100; celsius <= 100; celsius++) {
            // Call the static method to perform the calculation
            double fahrenheit = CtoF(celsius);

            // Print both values in aligned columns with Fahrenheit to 2 decimal places
            System.out.printf("%-10d | %-10.2f\n", celsius, fahrenheit);
        }
    }

    // Converts a Celsius temperature value to its Fahrenheit equivalent.
    public static double CtoF(double Celsius) {
        // (C * 9/5) + 32
        return (Celsius * 9.0 / 5.0) + 32.0;
    }
}