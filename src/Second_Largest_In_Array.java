import java.util.Scanner;

public class Second_Largest_In_Array {
    public static void main(String[] args) {
        System.out.println("Enter the number of element you want to insert:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] nums=new int[n];
        System.out.println("Enter the " +n+" element in the array: ");
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int first,second;
        first=second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>first)
            {
                second=first;
                first=nums[i];
            }else if(nums[i]>second && nums[i] != first){
                second=nums[i];
            }
        }

        if(second==Integer.MIN_VALUE){
            System.out.println("There is no second element");
        }else{
            System.out.println("The First largest element in the array is:"+first);
            System.out.println("The second largest element in the array is:"+second);
        }
    }
}
