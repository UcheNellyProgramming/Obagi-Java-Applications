import java.util.Scanner;

public class RoundingMethods {

    // Rounds to nearest integer
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    // Rounds to nearest tenth (1 decimal place)
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    // Rounds to nearest hundredth (2 decimal places)
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    // Rounds to nearest thousandth (3 decimal places)
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continueInput;

        do {
            System.out.print("Enter a number: ");
            double number = input.nextDouble();

            double intRounded = roundToInteger(number);
            double tenthRounded = roundToTenths(number);
            double hundredthRounded = roundToHundredths(number);
            double thousandthRounded = roundToThousandths(number);

            System.out.printf("%nOriginal number: %.10f%n", number);
            System.out.printf("Rounded to integer     : %.0f%n", intRounded);
            System.out.printf("Rounded to tenths      : %.1f%n", tenthRounded);
            System.out.printf("Rounded to hundredths  : %.2f%n", hundredthRounded);
            System.out.printf("Rounded to thousandths : %.3f%n%n", thousandthRounded);

            System.out.print("Do you want to round another number? (yes/no): ");
            continueInput = input.next().toLowerCase();
            System.out.println();

        } while (continueInput.equals("yes"));

        input.close();
        System.out.println("Program ended.");
    }
}
