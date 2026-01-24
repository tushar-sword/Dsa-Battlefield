package BitManipulation.Interview.FindNoOddlyPresent;

public class Optimal {

    public static int CountPresence(int[] arr){
        int ans = 0;

        for(int i=0 ; i<arr.length ;i++){
             ans = ans^i;
        }

        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,2,3,3,1,7,8,8};
        
        int finalans = CountPresence(arr);

        System.out.println(finalans);
    }
}
