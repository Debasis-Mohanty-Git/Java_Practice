import java.util.HashMap;
import java.util.Scanner;

public class Find_Frequency_Each_Element {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number of element you want to insert: ");
//        int n=sc.nextInt();
//
//        int[] arr=new int[n];
//        System.out.println("Enter "+n+" Elements in the array: ");
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }

        //USING HASHMAP

//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int num : arr){
//            map.put(num,map.getOrDefault(num,0)+1);
//        }
//
//        System.out.println("Frequency of each element:");
//        for (int key : map.keySet()) {
//            System.out.println(key + " → " + map.get(key) + " times");
//        }

          //WITHOUT USING HASHMAP
        int[] arr = {1, 2, 3, 2, 4, 1, 2, 5};
        boolean[] visited = new boolean[arr.length];

        System.out.println("Frequency of each element:");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " → " + count + " times");
        }
    }
}
