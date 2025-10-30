import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println("The multiplication table of the number "+num+" is: ");
        for(int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
