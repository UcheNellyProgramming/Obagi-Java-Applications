import java.util.Scanner;

public class AsteriskSquare {

    // Method to display a solid square of asterisks
    public static void squareOfAsterisks(int side) {
        for (int row = 0; row < side; row++) {
            for (int col = 0; col < side; col++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        int side = input.nextInt();

        System.out.println("\nHere is your square of asterisks:\n");
        squareOfAsterisks(side);

        input.close();
    }
}
