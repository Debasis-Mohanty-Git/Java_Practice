import java.util.Scanner;

public class Sum_Of_Digit {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int count=0;
        int countNum=num;
        int originalNumber=num;

        while(countNum>0){
            int digit=countNum%10;
            count++;
            countNum=countNum/10;
        }

        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("The digit of this number is "+count);
        System.out.println("The sum of the digit of "+ originalNumber +" is "+sum);
    }
}
