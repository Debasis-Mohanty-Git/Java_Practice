import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Duplicate_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element you want to insert: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter "+n+" Elements in the array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         //USING FOR LOOP
//        for (int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println("The duplicate elements are: "+arr[i]);
//                    break;
//                }
//            }
//        }

        //USING HASHSET
        HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> duplicates=new HashSet<>();

        for (int num:arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate elements: " + duplicates);
    }
}
