package Arrays.SecondLargestElement;

import java.util.*;
public class BruteForce {
    public static void main(String[] args) {
        
        int arr[]=  {7, 3, 7,4, -52, 2, 6, 5, 3, 5};
        Arrays.sort(arr);  // NLogN

        for(int i=  arr.length-2; i>0;i--){  //N
            if(arr[i] != arr[arr.length-1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}


// Time complexity = N  + NLOGN
