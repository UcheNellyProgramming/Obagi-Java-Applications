import java.util.Scanner;

public class DigitSeparator {

    // a) Method to calculate the integer part of the quotient
    public static int quotient(int a, int b) {
        return a / b;
    }

    // b) Method to calculate the remainder
    public static int remainder(int a, int b) {
        return a % b;
    }

    // c) Method to display digits separated by two spaces
    public static void displayDigits(int number) {
        // Reverse the number first, then extract each digit
        int divisor = 10000; // Start from highest possible digit (for 5-digit number)

        boolean leadingZero = true;

        while (divisor > 0) {
            int digit = quotient(number, divisor); // Get digit
            number = remainder(number, divisor);   // Remove digit from number
            divisor /= 10;

            // Skip leading zeros
            if (digit != 0 || !leadingZero || divisor == 0) {
                System.out.print(digit + "  ");
                leadingZero = false;
            }
        }

        System.out.println(); // Move to next line
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();

        if (number < 1 || number > 99999) {
            System.out.println("Invalid input. Please enter a number between 1 and 99999.");
        } else {
            System.out.print("Digits separated: ");
            displayDigits(number);
        }

        input.close();
    }
}
