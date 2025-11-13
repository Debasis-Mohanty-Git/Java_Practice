import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        System.out.println("Enter the number of element you want to insert in the array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter "+n+" Elements in the array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSort(arr);
        System.out.println();
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        int n=arr.length;
        int minIndex;
        for(int i=0;i<n-1;i++){
            minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
