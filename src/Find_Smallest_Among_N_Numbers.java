import java.sql.SQLOutput;
import java.util.Scanner;

public class Find_Smallest_Among_N_Numbers {
    public static void main(String[] args) {
        System.out.println("Enter the number of element you want to insert: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int smallest=Integer.MAX_VALUE;

        System.out.println("Enter "+num+" numbers");
        for(int i=0;i<num;i++){
            int n=sc.nextInt();
            if(n<smallest){
                smallest=n;
            }
        }
        System.out.println("The smallest number between "+num+" numbers is "+smallest);
    }
}
