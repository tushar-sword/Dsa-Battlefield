package Arrays.Medium_Level.TwoSum;

import java.util.HashMap;

public class MBetter {

    public static String TwoSum(int arr[],int target){
        HashMap<Integer,Integer> map = new HashMap<>();
      
     for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (map.containsKey(moreNeeded)) {
                return "YES";
            }

            map.put(arr[i], i);
        }
        return "NO";


    }
    public static void main(String[] args) {
        int arr[] ={1,2,4,5,3,6};
        int target = 11;

        String ans = TwoSum(arr,target);
        System.out.println(ans);
}
}

// TC = N
// SC = N