import java.util.Scanner;

public class Decimal_To_Octal {
    public static void main(String[] args) {
        System.out.println("Enter a decimal number: ");
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();

        String octal="";
        int num=decimal;
        while(num>0){
            int remainder=num%8;
            octal=remainder+octal;
            num=num/8;
        }
        System.out.println("The octal conversion of "+decimal+" is "+octal);
    }
}
