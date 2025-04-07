import java.util.Scanner;

public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Expense categories
        String[] categories = {
            "Housing", "Food", "Clothing", "Transportation", 
            "Education", "Health Care", "Vacations"
        };

        double totalExpenses = 0.0;

        System.out.print("Enter your annual spending in the following categories:");

        // Input expenses
        for (String category : categories) {
            System.out.print(category + ": $");
            double expense = input.nextDouble();
            totalExpenses += expense;
        }

        // FairTax rate is 23% of total spending
        double fairTax = totalExpenses * 0.23;

        System.out.printf("\nTotal annual spending: $%.2f%n", totalExpenses);
        System.out.printf("Estimated FairTax (23%% inclusive rate): $%.2f%n", fairTax);

        // Optional: Show the exclusive rate equivalent (which some opponents refer to as 30%)
        double fairTaxExclusiveRate = fairTax / (totalExpenses - fairTax) * 100;
        System.out.printf("Effective tax rate (exclusive): %.2f%%%n", fairTaxExclusiveRate);

        input.close();
    }
}
