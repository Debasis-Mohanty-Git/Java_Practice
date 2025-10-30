import java.util.Scanner;

public class Octal_To_Decimal {
    public static void main(String[] args) {
        System.out.println("Enter a decimal number: ");
        Scanner sc=new Scanner(System.in);
        String octal =sc.nextLine();

        int decimal = 0;
        int power = 0;

        for(int i=octal.length()-1;i>=0;i--){
            int digit=octal.charAt(i);
            int value = digit - '0';
            decimal += value * Math.pow(8, power);
            power++;
        }
        System.out.println("Decimal value of "  + octal + " is " + decimal);
    }
}
