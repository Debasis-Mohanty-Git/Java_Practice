import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num == 0 || num == 1) {
            System.out.println("Not a prime number");
            return;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The number is a prime number");
        } else {
            System.out.println("The number is not a prime number");
        }

        sc.close();
    }
}
