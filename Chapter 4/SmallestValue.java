import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of values to input
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();

        // Initialize the smallest number to a very large value
        int smallest = Integer.MAX_VALUE;

        // Read the values and find the smallest one
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter value " + i + ": ");
            int value = scanner.nextInt();

            // Check if the current value is smaller than the current smallest
            if (value < smallest) {
                smallest = value;
				System.out.println("The smallest value is: " + smallest);
            }
        }

        
        
    }
}