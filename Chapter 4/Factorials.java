public class Factorials {
    public static void main(String[] args) {
        System.out.printf("%-5s %25s%n", "n", "n!");
        System.out.println("----------------------------------------");

        for (int i = 1; i <= 20; i++) {
            long factorial = 1;

            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            System.out.printf("%-5d %25d%n", i, factorial);
        }
    }
}
