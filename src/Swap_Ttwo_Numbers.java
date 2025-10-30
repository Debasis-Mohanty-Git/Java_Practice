import java.util.Scanner;

public class Swap_Ttwo_Numbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println("Before swapping a is "+n1);
        System.out.println("Before swapping b is "+n2);

//Without using third variable
//        n1=n1+n2;
//        n2=n1-n2;
//        n1=n1-n2;


//With using third variable
        int temp;
        temp=n1;
        n1=n2;
        n2=temp;

        System.out.println("After swapping a is "+n1);
        System.out.println("After swapping b is "+n2);

    }
}
