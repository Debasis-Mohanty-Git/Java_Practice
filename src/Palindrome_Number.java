import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int originalNumber=num;

        while(num>0){
            int digit=num%10;
            sum=sum*10+digit;
            num=num/10;
        }
    
        if(originalNumber==sum){
            System.out.println("This number is a palindrome number");
        }else{
            System.out.println("Not a palindrome number");
        }

    }
}
