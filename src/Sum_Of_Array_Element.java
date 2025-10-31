import java.util.Scanner;

public class Sum_Of_Array_Element {
    public static void main(String[] args) {
        System.out.println("Enter the number of element you want to insert in the array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter the element in the array: ");
        for (int i=0;i<n;i++){
            num[i]= sc.nextInt();
        }

        int sum=0;
        for (int i=0;i<n;i++){
            sum=sum+num[i];
        }
        System.out.println("The sum of all the array element is "+sum);
    }
}
