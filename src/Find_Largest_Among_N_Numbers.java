import java.sql.SQLOutput;
import java.util.Scanner;

public class Find_Largest_Among_N_Numbers {
    public static void main(String[] args) {
        System.out.println("Enter the number of element you want to insert: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int largest=Integer.MIN_VALUE;

        System.out.println("Enter "+num+" numbers");
        for(int i=0;i<num;i++){
            int n=sc.nextInt();
            if(n>largest){
               largest=n;
            }
        }
        System.out.println("The largest number between "+num+" numbers is "+largest);
    }
}
