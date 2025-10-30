import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        System.out.println("Enter a binary number: ");
        Scanner sc=new Scanner(System.in);
        String binary=sc.nextLine();

        int decimal=0;
        int power=0;

        for(int i=binary.length()-1;i>=0;i--){
            char bit=binary.charAt(i);
            if(bit=='1'){
                decimal+=Math.pow(2,power);
            }
            power++;
        }
        System.out.println("The decimal of this binary number "+binary+" is "+decimal);
    }
}
