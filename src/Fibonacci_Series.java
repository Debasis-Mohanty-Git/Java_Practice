import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int num=sc.nextInt();
        int first=0;
        int second=1;
        int third;
        System.out.println("The fibonacci series is :");
        for(int i=1;i<=num;i++){

            System.out.print(first + " ");
            third=first+second;
            first=second;
            second=third;
        }
        sc.close();
    }
}
