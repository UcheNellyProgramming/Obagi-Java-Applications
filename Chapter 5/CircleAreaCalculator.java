import java.util.Scanner;

public class CircleAreaCalculator {

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Call method to calculate area
        double area = circleArea(radius);

        // Display the result
        System.out.printf("The area of the circle with radius %.2f is %.2f%n", radius, area);

        input.close();
    }
}
