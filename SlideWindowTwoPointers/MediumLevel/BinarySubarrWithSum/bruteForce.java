package SlideWindowTwoPointers.MediumLevel.BinarySubarrWithSum;

public class bruteForce {
    public static void main(String args[]){
         int []nums = {1, 0, 0, 1, 1, 0};
         int goal = 2 ; 
         int n=nums.length;


         int count = 0;

         for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                
                sum=sum+nums[j];

                if(sum==goal){
                    count++;
                }
            }
         }

         System.out.println(count);
    }
}
