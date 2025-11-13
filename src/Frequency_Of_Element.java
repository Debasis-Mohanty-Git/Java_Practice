import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Frequency_Of_Element {
    public static void main(String[] args) {
        int arr[]={10,20,10,30,20,10};

        HashMap<Integer,Integer> frequencyMap=new HashMap<>();

        for(int num:arr){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }

        System.out.println("Element : Frequency");
        for (Integer key : frequencyMap.keySet()) {
            System.out.println(key + " : " + frequencyMap.get(key));
        }

    }
}
