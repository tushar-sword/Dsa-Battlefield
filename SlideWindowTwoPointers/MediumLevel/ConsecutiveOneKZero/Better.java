package SlideWindowTwoPointers.MediumLevel.ConsecutiveOneKZero;

public class Better {
    public static void main(String args[]){
    int nums[] = {1, 1, 1, 0, 0, 0, 1, 1, 1,1, 0};
    int n = nums.length;
    
        int maxLen=0;
    int L =0;
    int R =0;
    int k=2;
    int Zcount=0;
    int len =0;

    while(R<n){
        if(nums[R]==0){
            Zcount++;
        }

        while(Zcount > k){
            if(nums[L]==0){
                Zcount--;
            }
            L++;
        }


        len = R - L + 1;
        
        maxLen = Math.max(maxLen, len);

        R++;
    }

    System.out.println(maxLen);
}
}

// TC = 2N
// SC = 1
