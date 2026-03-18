import java.util.Scanner;

public class FibonacciEvenSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit N: ");
        int N = sc.nextInt();

        int a = 0, b = 1;
        int sum = 0;

        System.out.print("Fibonacci series up to " + N + ": ");

        while (a <= N) {
            System.out.print(a + " ");

            if (a % 2 == 0) {
                sum += a;
            }

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("\nSum of even Fibonacci numbers: " + sum);
        sc.close();
    }
}
