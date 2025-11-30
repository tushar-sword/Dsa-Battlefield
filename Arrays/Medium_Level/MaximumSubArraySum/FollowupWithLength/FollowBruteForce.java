package Arrays.Medium_Level.MaximumSubArraySum.FollowupWithLength;

public class FollowBruteForce {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int maxi=Integer.MIN_VALUE; 
        int start = -1;
        int end = -1;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum = sum + arr[j];
                //change

                
            if (sum > maxi) {
                maxi = sum;
                start = i;
                end = j;
            }
            }
        }

        System.out.println(maxi +" start with =  "+ start+", end with : " + end );
    }
}
