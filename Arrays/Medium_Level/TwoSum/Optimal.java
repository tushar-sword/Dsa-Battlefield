package Arrays.Medium_Level.TwoSum;
import java.util.*;
public class Optimal {
    public static void main(String[] args) {
        int arr[] ={1,2,4,5,3,6};
        int target=11;

        Arrays.sort(arr);

        int left = 0 ;
        int right = arr.length-1;

        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.println("found");
                break;
            }
            else if(arr[left]+arr[right]>target){
                right --;
            }
            else{
                left++;
            }
        }

    }
}


// TC - N + NLOGN
// SC - 1 