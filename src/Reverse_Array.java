import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        System.out.println("Enter the number of element you want to insert:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the " +n+" element in the array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array before reversing:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

       int start=0;
        int end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        System.out.println();
        System.out.println("Array after reversing:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
