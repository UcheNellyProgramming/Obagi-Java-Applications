import java.util.Scanner;

public class SquareOfAnyCharacter {

    // Method to display a square of any character
    public static void squareOfAnyCharacter(int side, char fillCharacter) {
        for (int row = 0; row < side; row++) {
            for (int col = 0; col < side; col++) {
                System.out.print(fillCharacter);  // Print the specified character
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for the side length of the square
        System.out.print("Enter the side length of the square: ");
        int side = input.nextInt();

        // Input for the fill character
        System.out.print("Enter the character to fill the square: ");
        char fill = input.next().charAt(0);  // Read a single character

        System.out.println("\nHere is your square of characters:\n");
        squareOfAnyCharacter(side, fill);

        input.close();
    }
}
