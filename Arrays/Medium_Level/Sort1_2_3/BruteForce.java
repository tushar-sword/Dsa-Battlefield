package Arrays.Medium_Level.Sort1_2_3;

import java.util.*;
public class BruteForce {
    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 2, 0, 1};
        Arrays.sort(arr);

        for(int a : arr){
            System.out.println(a);
        }
    }
}

// TC = NLOGN 
// SC = 1