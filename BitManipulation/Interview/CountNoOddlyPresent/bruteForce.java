package BitManipulation.Interview.CountNoOddlyPresent;

import java.util.HashMap;

public class bruteForce {
    //In the Brute Force = we can use the HashMap then count the frequeny the number with 1 frequency is the answer

    public static int CountPresence(int[] arr){

        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int num : arr){
            mpp.put(num, mpp.getOrDefault(num,0)+1); // updating map with freq count
        }

        //Now iterate to check frequency

        for(int key : mpp.keySet()){
            if(mpp.get(key)==1){
                return key;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,2,3,3,1,7,8,8};
        
        int ans = CountPresence(arr);

        System.out.println(ans);
    }
}

//Time complexity = N
// space complexity = N
