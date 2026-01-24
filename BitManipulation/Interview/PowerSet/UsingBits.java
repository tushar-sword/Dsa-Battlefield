package BitManipulation.Interview.PowerSet;

import java.util.ArrayList;
import java.util.List;

public class UsingBits {

    public static List<List<Integer>> getPowerSet(int[] nums){

         int n = nums.length;

         int subsets = 1<<n;

          // List to store all subsets
        List<List<Integer>> ans = new ArrayList<>();

        // Iterate through all numbers from 0 to 2^n - 1
        for (int num = 0; num < subsets; num++){ // this num is getting used to create the 000 001 .. table and on it basis 5 6 7 got selected

            // Temporary list to hold current subset
            List<Integer> subset = new ArrayList<>();

            // Iterate through each bit of the number
            for (int i = 0; i < n; i++) {
                // If ith bit is set, include nums[i] in the subset
                if ((num & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }

              // Add this subset into the final result
            ans.add(subset);
        }

        // Return all subsets
        return ans;
    }
        
    
    public static void main(String[] args) {
        // Input array
        int[] nums = {5, 7, 8};

        

        // Generate power set
        List<List<Integer>> subsets = getPowerSet(nums);

        // Print input array
        System.out.print("Initial Input Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print subsets
        System.out.println("Subsets:");
        for (List<Integer> subset : subsets) {
            System.out.print("[ ");
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }
}
