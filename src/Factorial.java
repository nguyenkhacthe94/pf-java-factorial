import java.util.Scanner;

public class Factorial {
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Enter number to get factorial: ");
            n = input.nextInt();
            if (n < 0) System.out.println("\nInvalid number.");
        } while (n < 0);
        long result = factorial(n);
        System.out.print("\n" + n + "!= " + result);
    }
}
