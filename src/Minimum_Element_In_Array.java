import java.util.Scanner;

public class Minimum_Element_In_Array {
    public static void main(String[] args) {
        System.out.println("Enter the number of element you want to insert:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] nums=new int[n];
        System.out.println("Enter the " +n+" element in the array: ");
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("The minimum element in the array is "+min);
    }
}
