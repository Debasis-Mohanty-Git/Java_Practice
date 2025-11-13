import java.util.Arrays;

public class Move_Zero_To_Last {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);
        System.out.println("After shifting all the zeros to the last: "+ Arrays.toString(arr));
    }

    private static void moveZeros(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}
