import javax.swing.*;
import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println("Factorial of the number is "+factorial(num));

    }

    public static int factorial(int num) {
        if(num==0 || num==1){
            return 1;
        }else{
            return num*factorial(num-1);
        }

    }
}
