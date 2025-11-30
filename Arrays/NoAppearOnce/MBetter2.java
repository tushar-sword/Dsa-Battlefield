package Arrays.NoAppearOnce;

import java.util.HashMap;
import java.util.Map;

public class MBetter2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2,4};
        int n = arr.length;

        HashMap<Integer,Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                 System.out.println( it.getKey());
            }
        }


    }
}
