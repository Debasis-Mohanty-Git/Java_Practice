import java.util.Scanner;

public class Sum_Natural_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
//        int sum=0;

//        for(int i=1;i<=num;i++){
//            sum=sum+i;
//        }

        int result=num*(num+1)/2;
        System.out.println("the sum of first "+num+" Natural number is "+result);
    }
}
