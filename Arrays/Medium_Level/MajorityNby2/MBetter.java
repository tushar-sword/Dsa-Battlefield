package Arrays.Medium_Level.MajorityNby2;

import java.util.HashMap;
import java.util.Map;

public class MBetter {
    public static void main(String[] args) {
        
   
    int[] arr = {2, 2, 1, 1, 1,1,1,2, 2, 2,3,3,3,3,3,3,3,3,3,3,3,3};
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }

         for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > (arr.length / 2)) {
                System.out.println( it.getKey());
            }
        }
     }
}

//TC = 2N
// SC = N
