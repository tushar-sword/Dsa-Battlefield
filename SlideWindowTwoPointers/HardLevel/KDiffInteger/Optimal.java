package SlideWindowTwoPointers.HardLevel.KDiffInteger;

import java.util.HashMap;
import java.util.Map;

public class Optimal {

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private static int atMostK(int[] nums, int k) {
        if (k < 0) return 0;

        int n = nums.length;
        int L = 0;
        int count = 0;

        Map<Integer, Integer> mpp = new HashMap<>();

        for (int R = 0; R < n; R++) {

            // add right element
            mpp.put(nums[R], mpp.getOrDefault(nums[R], 0) + 1);

            // shrink window if distinct > k
            while (mpp.size() > k) {
                mpp.put(nums[L], mpp.get(nums[L]) - 1);

                if (mpp.get(nums[L]) == 0) {
                    mpp.remove(nums[L]);
                }
                L++;
            }

            // all subarrays ending at R
            count += (R - L + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        System.out.println(subarraysWithKDistinct(nums, k)); // Output: 7
    }
}
