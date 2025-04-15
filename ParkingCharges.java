import java.util.Scanner;

public class ParkingCharges {
    
    // Method to calculate parking charge
    public static double calculateCharges(double hours) {
        double charge = 2.00; // base charge for up to 3 hours

        if (hours <= 3) {
            return charge;
        } else {
            charge += Math.ceil(hours - 3) * 0.50;
        }

        // Maximum charge for 24 hours
        return Math.min(charge, 10.00);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;

        System.out.print("Enter the number of customers: ");
        int numCustomers = input.nextInt();

        System.out.println("\nCustomer\tHours\tCharge");

        for (int i = 1; i <= numCustomers; i++) {
            System.out.print("Enter hours parked for customer " + i + ": ");
            double hours = input.nextDouble();

            double charge = calculateCharges(hours);
            totalReceipts += charge;

            System.out.printf("Customer %d\t\t%.2f\t$%.2f%n", i, hours, charge);
        }

        System.out.printf("\nTotal receipts: $%.2f%n", totalReceipts);
        input.close();
    }
}
