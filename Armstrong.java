import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int temp = n;
        int digits = 0;
        int sum = 0;

        if (n < 0) {
            System.out.println("Not Armstrong");
            return;
        }

        do {
            digits++;
            temp = temp / 10;
        } while (temp != 0);

        temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}