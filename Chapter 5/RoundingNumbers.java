import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter a decimal number to round: ");
            double x = input.nextDouble();

            // Round using Math.floor(x + 0.5)
            double y = Math.floor(x + 0.5);

            // Output
            System.out.printf("Original: %.2f | Rounded: %.0f%n", x, y);

            // Ask user if they want to enter another number
            System.out.print("Do you want to round another number? (yes/no): ");
            choice = input.next().toLowerCase();

        } while (choice.equals("yes"));

        input.close();
        System.out.println("Program ended.");
    }
}
