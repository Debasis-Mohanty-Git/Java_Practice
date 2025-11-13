import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Remove_Duplicate_From_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element you want to insert: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter "+n+" Elements in the array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //USING HASHSET
//        HashSet<Integer> unique=new HashSet<>();
//        for(int num:arr){
//            unique.add(num);
//        }
//
//        System.out.println("Duplicate elements: " + unique);

        //USING SORTING
        Arrays.sort(arr);
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1];

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
