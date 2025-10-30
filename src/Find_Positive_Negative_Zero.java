import java.util.Scanner;

public class Find_Positive_Negative_Zero {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num>0){
            System.out.println("The given number is positive number ");
        } else if (num<0) {
            System.out.println("The given number is negative number ");
        }else{
            System.out.println("The given number is zero");
        }
    }
}
