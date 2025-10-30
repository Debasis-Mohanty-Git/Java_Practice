import java.util.Scanner;

public class Celsius_To_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        int celsius=sc.nextInt();

        double fahrenheit=(celsius*9/5)+32;
        System.out.println("The fahrenheit of"+celsius+" celsius is "+fahrenheit);
    }
}
