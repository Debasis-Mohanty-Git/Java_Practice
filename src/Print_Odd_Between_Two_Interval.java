import java.util.Scanner;

public class Print_Odd_Between_Two_Interval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1=sc.nextInt();

        System.out.println("Enter second Number: ");
        int num2=sc.nextInt();

        System.out.println("The odd number between "+num1+ " and "+num2+" is ");
        for(int i=num1+1;i<=num2;i++){
            if(i%2!=0){
                System.out.println(i+" ");
            }
        }

    }
}
