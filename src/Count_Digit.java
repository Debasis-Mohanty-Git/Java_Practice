import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int originalNumber=num;
        int count=0;

        while(num>0){
            int digit=num%10;
            count++;
            num=num/10;
        }

        System.out.println("The total no of digit in "+originalNumber+" is "+count);
    }
}
