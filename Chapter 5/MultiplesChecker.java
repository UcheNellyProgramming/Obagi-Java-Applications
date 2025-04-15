import java.util.Scanner;

public class MultiplesChecker {

    // Method to determine if second number is a multiple of the first
    public static boolean isMultiple(int first, int second) {
        return second % first == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char continueInput;
        do {
            System.out.print("Enter the first integer: ");
            int num1 = input.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = input.nextInt();

            if (isMultiple(num1, num2)) {
                System.out.printf("%d is a multiple of %d%n", num2, num1);
            } else {
                System.out.printf("%d is NOT a multiple of %d%n", num2, num1);
            }

            System.out.print("Do you want to enter another pair? (Y/N): ");
            continueInput = input.next().charAt(0);

        } while (continueInput == 'Y' || continueInput == 'y');

        input.close();
    }
}
