import java.util.Scanner;

public class Search_Element_Using_Linear_Search {
    public static void main(String[] args) {
        System.out.println("Enter the number of element you want to insert:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the " +n+" element in the array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the searching element from the array: ");
        int key=sc.nextInt();

        boolean found=false;
        int index = 0;
        for (int i=0;i<n;i++){
            if(arr[i]==key){
                found=true;
                index=i;
                break;
            }
        }

        if (found){
            System.out.println("Element " + key + " found at position " + index);
        }else{
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}
