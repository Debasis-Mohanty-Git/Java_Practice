import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int originalNum=num;
        int sum=0;
        int count=0;

        int temp = num;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

//        int digits=String.valueOf(num).length();
        while(num>0){
            int digit=num%10;
            sum += Math.pow(digit, count);
            num=num/10;
        }

        if(originalNum==sum){
            System.out.println("The number is a Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }
    }
}
