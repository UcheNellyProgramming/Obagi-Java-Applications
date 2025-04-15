import java.util.Scanner;

public class HypotenuseCalculator {

    // Method to calculate hypotenuse using the Pythagorean theorem
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();

        double hypotenuseValue = hypotenuse(side1, side2);

        System.out.printf("Hypotenuse of the triangle is: %.2f%n", hypotenuseValue);

        input.close();
    }
}
