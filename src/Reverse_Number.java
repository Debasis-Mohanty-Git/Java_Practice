import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

//        int reverse=0;
          int actualNumber=num;
//        while(num>0){
//           int digit=num%10;
//           reverse=reverse*10+digit;
//           num=num/10;
//
//        }

//        StringBuilder sb=new StringBuilder();
//        sb.append(num);

		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		rev=sb.reverse();

        System.out.println("Thr reverse of the number "+actualNumber+" is "+rev);
    }
}
