import java.util.Arrays;
import java.util.Scanner;

public class Search_Element_Using_Binary_Search {
    public static void main(String[] args) {
        System.out.println("Enter the number of element you want to insert:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the " +n+" element in the array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Enter the searching element from the array: ");
        int key=sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        boolean found=false;
        int index=0;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                found=true;
                index=mid;
                break;
            }else if(arr[mid]<key){
                low=mid+1;
            }else{
               high=mid-1;
            }
        }
        if (found){
            System.out.println("Element " + key + " found at position " + index);
        }else{
            System.out.println("Element " + key + " not found in the array.");
        }

    }
}
