package Arrays.Medium_Level.TwoSum;

public class BruteForce {
    public static void main(String[] args) {
        int arr[] ={1,2,4,5,3,6};
        int target=11;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("found at " + i + "," + j);
                }
            }
        }
        
    }
}


// Time complexity = N^2 
// Space complexity = 1