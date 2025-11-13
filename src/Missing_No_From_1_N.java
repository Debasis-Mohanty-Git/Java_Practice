import java.util.Scanner;

public class Missing_No_From_1_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element you want to insert: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter "+n+" Elements in the array: ");
        for (int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }

        int totalSum = n * (n + 1) / 2;

        int arraySum=0;
        for (int nums:arr){
            arraySum=arraySum+nums;
        }

        System.out.println("The missing number in the array is: "+(totalSum-arraySum));
    }
}
