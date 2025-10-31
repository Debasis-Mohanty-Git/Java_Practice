import java.util.Scanner;

public class Third_Largest_Element {
    public static void main(String[] args) {
        System.out.println("Enter the number of element you want to insert:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] nums=new int[n];
        System.out.println("Enter the " +n+" element in the array: ");
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int first,second,third;
        first=second=third=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]>first)
            {
                third=second;
                second=first;
                first=nums[i];
            }else if(nums[i] > second && nums[i] != first){
                third=second;
                second=nums[i];
            }else if(nums[i] > third && nums[i] != second && nums[i] != first){
                third=nums[i];
            }
        }

        if(third==Integer.MIN_VALUE){
            System.out.println("There is no second element");
        }else{
            System.out.println("The First largest element in the array is:"+first);
            System.out.println("The second largest element in the array is:"+second);
            System.out.println("The third largest element in the array is:"+third);
        }
    }
}
