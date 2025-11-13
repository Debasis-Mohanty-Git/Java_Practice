import java.util.*;

public class Rotate_An_Array {
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Right Shift by k position
//    static void rotateRight(int[] arr, int k) {
//        int n = arr.length;
//        k = k % n;
//
//        // Step 1: Reverse the entire array
//        reverse(arr, 0, n - 1);
//
//        // Step 2: Reverse first k elements
//        reverse(arr, 0, k - 1);
//
//        // Step 3: Reverse remaining n - k elements
//        reverse(arr, k, n - 1);
//    }


    static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k );

        // Step 3: Reverse remaining n - k elements
        reverse(arr, k+1, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(arr));

//        rotateRight(arr, k);
        rotateLeft(arr, k);

        System.out.println("Array after rotating by " + k + " positions: " + Arrays.toString(arr));
    }
}
