package Arrays.Medium_Level.MaximumSubArraySum.FollowupWithLength;

public class FollowOptimal {
    public static void main(String[] args) {
         int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
         int sum=0;
         int start = 0;
         int Start = -1;
         int end = -1;
         int maxi = Integer.MIN_VALUE; 

         for(int i=0;i<arr.length;i++){

            if (sum == 0) start = i;
                
              sum+=arr[i];
              
                if (sum > maxi) {
                maxi = sum;

                Start = start;
                end = i;
            }

              if(sum<0){
                sum=0;
              }          
    }
    System.out.println(maxi +" start with =  "+ Start+", end with : " + end );
    }
}

