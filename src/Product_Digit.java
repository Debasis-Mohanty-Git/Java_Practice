import java.util.Scanner;

public class Product_Digit {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int originalNumber=num;
        int product=1;

        while(num>0){
            int remainder=num%10;
            product=product*remainder;
            num=num/10;
        }
        System.out.println("The product of all the digit in a number is "+product);
    }
}
