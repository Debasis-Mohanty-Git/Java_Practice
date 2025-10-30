import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        System.out.println("Enter a decimal number: ");
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        int num=decimal;

        String binary="";
        while(num>0){
            int remainder=num%2;
            binary=remainder + binary;
            num=num/2;
        }
        System.out.println("Thr binary form of "+decimal+" is "+binary);
    }
}
