import java.util.*;

class Armstrong {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = s.nextInt();

        int original = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += (int)Math.pow(digit, digits);
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
