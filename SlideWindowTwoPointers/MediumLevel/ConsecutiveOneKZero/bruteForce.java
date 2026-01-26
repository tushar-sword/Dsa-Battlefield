package SlideWindowTwoPointers.MediumLevel.ConsecutiveOneKZero;

public class bruteForce {

    public static void main(String args[]){
    int nums[] = {1, 1, 1, 0, 0, 0, 1, 1, 1,1, 0};
    int n = nums.length;
    
        int maxCount=0;
    for(int i=0;i<n;i++){
        int count=0;
        int k=2;
        for(int j=i;j<n;j++){
            if(nums[j]==1){
                count++;
            }

            else if(nums[j]==0 && k > 0){
                count++;
                k--;
            }
            else{
                break;
            }
            maxCount = Math.max(maxCount, count);
        }
    }

    System.out.println(maxCount);
}
}

// TC = N^2
// SC = 1
