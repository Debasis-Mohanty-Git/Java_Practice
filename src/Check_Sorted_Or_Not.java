public class Check_Sorted_Or_Not {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,5};
        boolean isSorted = checkSorted(arr);
        System.out.println("Is array sorted? " + isSorted);
    }

    private static boolean checkSorted(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
