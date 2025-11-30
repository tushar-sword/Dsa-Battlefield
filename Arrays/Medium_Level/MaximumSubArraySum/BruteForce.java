package Arrays.Medium_Level.MaximumSubArraySum;

public class BruteForce {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int maxi=Integer.MIN_VALUE; 
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum = sum + arr[j];
                maxi = Math.max(maxi, sum);
            }
        }

        System.out.println(maxi);
    }
}


// solution with three loop too N^3

//TC = N^2
//SC = 1