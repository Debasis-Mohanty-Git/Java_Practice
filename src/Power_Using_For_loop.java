import java.util.Scanner;

public class Power_Using_For_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a base number: ");
        int base=sc.nextInt();

        System.out.println("Enter a exponent of the number: ");
        int exponent=sc.nextInt();

        int result=1;
        for(int i=1;i<=exponent;i++){
            result=result*base;
        }

        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}
