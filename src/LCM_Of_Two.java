import java.util.Scanner;

public class LCM_Of_Two {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int num1 = a, num2 = b;
        while(b>0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        int lcm=(num1*num2)/gcd;
        System.out.println("LCM= "+lcm);
    }
}
