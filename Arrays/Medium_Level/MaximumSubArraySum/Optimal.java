package Arrays.Medium_Level.MaximumSubArraySum;

public class Optimal {
    public static void main(String[] args) {
         int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
         int sum=0;
         int maxi = Integer.MIN_VALUE; 

         for(int i=0;i<arr.length;i++){
              sum+=arr[i];
              maxi = Math.max(maxi, sum);
              if(sum<0){
                sum=0;
              }          
    }
    System.out.println(maxi);
}
}
