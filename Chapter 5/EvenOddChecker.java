import java.util.Scanner;

public class EvenOddChecker {

    // Method to check if an integer is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continueInput;

        do {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();

            if (isEven(number)) {
                System.out.printf("%d is even.%n", number);
            } else {
                System.out.printf("%d is odd.%n", number);
            }

            System.out.print("Do you want to check another number? (Y/N): ");
            continueInput = input.next().charAt(0);

        } while (continueInput == 'Y' || continueInput == 'y');

        input.close();
    }
}
