public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0; // initial amount before interest
        int years = 10;

        System.out.printf("%-10s", "Year");

        // Print headers for interest rates 5% to 10%
        for (int rate = 5; rate <= 10; rate++) {
            System.out.printf("%10s", rate + "%");
        }
        System.out.println("\n----------------------------------------------------------");

        // Loop through each year
        for (int year = 1; year <= years; year++) {
            System.out.printf("%-10d", year);

            // Loop through each interest rate
            for (int rate = 5; rate <= 10; rate++) {
                double amount = principal * Math.pow(1 + rate / 100.0, year);
                System.out.printf("%10.2f", amount);
            }

            System.out.println();
        }
    }
}
