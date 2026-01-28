package SlideWindowTwoPointers.HardLevel.KDiffInteger;

import java.util.HashMap;
import java.util.Map;

public class bruteForce {
    
    public static void main(String args[]){

        int nums[] = {1, 2, 1, 2, 3},  k = 2 ;
        int n=nums.length;
        int count=0;

        for(int i=0;i<n;i++){

            Map<Integer, Integer> map = new HashMap<>();

            for(int j=i;j<n;j++){

                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

                 if (map.size() == k){
                    count++;
                 }
                if(map.size()>k){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
