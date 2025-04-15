public class PerfectNumbers {

    // Method to determine if a number is perfect
    public static boolean isPerfect(int number) {
        int sum = 0;
        // Find all factors (excluding the number itself)
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // Method to print all factors of a perfect number
    public static void printFactors(int number) {
        System.out.print("Factors: ");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:\n");

        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.println(i + " is a perfect number.");
                printFactors(i);
                System.out.println();
            }
        }

        
    }
}
