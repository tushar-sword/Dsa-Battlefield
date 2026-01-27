package SlideWindowTwoPointers.MediumLevel.OddSubArrCount;

public class Optimal {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        // intution this is same binary like  odd % 2 = 1 even % 2 = 0;
        // important 
        int result = atMost(nums, k) - atMost(nums, k - 1);
        System.out.println(result);
    }

    static int atMost(int[] nums, int k) {
        int L = 0, count = 0;

        for (int R = 0; R < nums.length; R++) {

            if (nums[R] % 2 != 0) {
                k--;
            }

            while (k < 0) {
                if (nums[L] % 2 != 0) {
                    k++;
                }
                L++;
            }

            count += (R - L + 1);
        }

        return count;
    }
}
