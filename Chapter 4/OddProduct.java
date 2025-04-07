public class OddProduct {
    public static void main(String[] args) {
        int product = 1;

        for (int i = 1; i <= 15; i += 2) {  // Loop through odd numbers only
            product *= i;  // Multiply the current odd number
        }

        System.out.println("The product of odd integers from 1 to 15 is: " + product);
    }
}
