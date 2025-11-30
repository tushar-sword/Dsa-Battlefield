package Arrays.MaxConsecutiveOne;


public class MaxConsecutiveOne {
    public static void main(String[] args) {
         int nums[] = { 1, 1, 0, 1, 1, 1 };
         int cnt = 0;
        int maxi = 0;

         for(int i=0;i<nums.length;i++){
                if(nums[i]==1){
                    cnt++;
                }
                else{
                    cnt=0;
                }

                maxi = Math.max(maxi, cnt);

         }
         System.out.println("max no. of consecutive one "+ maxi);
    }
}
