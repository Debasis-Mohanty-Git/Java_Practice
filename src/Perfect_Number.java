import java.sql.SQLOutput;
import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;

        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(num==sum){
            System.out.println("The given number is a perfect number");
        }else{
            System.out.println("The given number is not a perfect number");
        }
    }
}
