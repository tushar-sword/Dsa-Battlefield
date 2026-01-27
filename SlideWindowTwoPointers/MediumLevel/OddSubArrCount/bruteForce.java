package SlideWindowTwoPointers.MediumLevel.OddSubArrCount;

public class bruteForce {
    public static void main(String args[]){

             int[] nums = {1, 1, 2, 1, 1};
             int k=3;

             int count = 0;

        
        for (int i = 0; i < nums.length; i++) {
            int oddCount = 0;

            // Loop over ending indices starting from 'start'
            for (int j = i; j < nums.length; j++) {
                if (nums[j] % 2 != 0)
                    oddCount++;

                if (oddCount > k)
                    break;

                // If odd count is exactly k, count this subarray
                if (oddCount == k)
                    count++;
            }
        }

       System.out.println(count);
}
    }

