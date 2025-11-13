import java.util.Scanner;

public class Bubble_Sort {
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

        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped=false;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
