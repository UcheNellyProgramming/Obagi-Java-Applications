import java.util.Scanner;

public class TemperatureConverter {

    // a) Method to convert Fahrenheit to Celsius
    public static double celsius(int fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    // b) Method to convert Celsius to Fahrenheit
    public static double fahrenheit(int celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    // c) Main application
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Temperature Conversion");
        System.out.println("1 - Convert Fahrenheit to Celsius");
        System.out.println("2 - Convert Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            int f = input.nextInt();
            double c = celsius(f);
            System.out.printf("Equivalent in Celsius: %.2f°C%n", c);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            int c = input.nextInt();
            double f = fahrenheit(c);
            System.out.printf("Equivalent in Fahrenheit: %.2f°F%n", f);
        } else {
            System.out.println("Invalid choice. Please run the program again.");
        }

        input.close();
    }
}
