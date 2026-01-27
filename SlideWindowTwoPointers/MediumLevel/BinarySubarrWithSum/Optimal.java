package SlideWindowTwoPointers.MediumLevel.BinarySubarrWithSum;

public class Optimal{

    // logic 
    // exact(goal) = atMost(goal) - atMost(goal - 1)


    static int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;

        int L = 0, sum = 0, count = 0;

        for (int R = 0; R < nums.length; R++) {
            sum += nums[R];

            while (sum > goal) {
                sum -= nums[L];
                L++;
            }

            // number of subarrays ending at R
            count += (R - L + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1, 1, 0};
        int goal = 2;

        int result = atMost(nums, goal) - atMost(nums, goal - 1);
        System.out.println(result);
    }
}
